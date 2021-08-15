import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int d[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		int N = Integer.parseInt(reader.readLine());
		int ans[] = new int[7];

		char fld[][] = new char[N][N];

		for (int i = 0; i < N; i++) {
			String tmp = reader.readLine();

			for (int j = 0; j < N; j++)
				fld[i][j] = tmp.charAt(j);
		}

		int y = -1;
		int x = -1;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (fld[i][j] == '*') {
					boolean flag = true;

					for (int k = 0; k < 4; k++) {
						int yNext = i + d[k][0];
						int xNext = j + d[k][1];

						if (yNext < 0 || N <= yNext || xNext < 0 || N <= xNext) {
							flag = false;
							break;
						} else if (fld[yNext][xNext] != '*') {
							flag = false;
							break;
						}
					}

					if (flag) {
						y = i;
						x = j;

						i = N;
						j = N;
					}
				}
			}
		}

		ans[0] = y;
		ans[1] = x;
		int cnt = 0;

		while (fld[y][x] == '*') {
			if (0 <= x - 1 && fld[y][x - 1] == '*') {
				x--;
				cnt++;
			} else {
				break;
			}
		}

		ans[2] = cnt;

		y = ans[0];
		x = ans[1];
		cnt = 0;

		while (fld[y][x] == '*') {
			if (x + 1 < N && fld[y][x + 1] == '*') {
				x++;
				cnt++;
			} else {
				break;
			}
		}

		ans[3] = cnt;

		y = ans[0];
		x = ans[1];
		cnt = 0;

		while (fld[y][x] == '*') {
			if (y + 1 < N && fld[y + 1][x] == '*') {
				y++;
				cnt++;
			} else {
				break;
			}
		}

		ans[4] = cnt;

		y = ans[0] + ans[4] + 1;
		x = ans[1] - 1;
		cnt = 1;

		while (fld[y][x] == '*') {
			if (y + 1 < N && fld[y + 1][x] == '*') {
				y++;
				cnt++;
			} else {
				break;
			}
		}

		ans[5] = cnt;

		y = ans[0] + ans[4] + 1;
		x = ans[1] + 1;
		cnt = 1;

		while (fld[y][x] == '*') {
			if (y + 1 < N && fld[y + 1][x] == '*') {
				y++;
				cnt++;
			} else {
				break;
			}
		}

		ans[6] = cnt;

		System.out.println((ans[0] + 1) + " " + (ans[1] + 1));
		System.out.println(ans[2] + " " + ans[3] + " " + ans[4] + " " + ans[5] + " " + ans[6]);

	}
}
