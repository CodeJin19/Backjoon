import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int fld[][] = new int[5][5];
		boolean check[][] = new boolean[5][5];
		StringTokenizer st;

		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(reader.readLine());

			for (int j = 0; j < 5; j++) {
				fld[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int bingo = 0;
		int cnt = 0;

		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(reader.readLine());

			for (int j = 0; j < 5; j++) {
				int num = Integer.parseInt(st.nextToken());
				cnt++;

				if (3 <= bingo)
					continue;

				for (int y = 0; y < 5; y++) {
					for (int x = 0; x < 5; x++) {
						if (fld[y][x] == num) {
							check[y][x] = true;
							y = 5;
							break;
						}
					}
				}

				bingo = 0;

				for (int y = 0; y < 5; y++) {
					boolean flag = true;

					for (int x = 0; x < 5; x++) {
						if (!check[y][x]) {
							flag = false;
							break;
						}
					}

					if (flag)
						bingo++;
				}

				for (int x = 0; x < 5; x++) {
					boolean flag = true;

					for (int y = 0; y < 5; y++) {
						if (!check[y][x]) {
							flag = false;
							break;
						}
					}

					if (flag)
						bingo++;
				}

				int y = 0;
				int x = 0;
				boolean flag = true;

				for (int idx = 0; idx < 5; idx++) {
					if (!check[y + idx][x + idx]) {
						flag = false;
						break;
					}
				}

				if (flag)
					bingo++;

				y = 0;
				x = 4;
				flag = true;

				for (int idx = 0; idx < 5; idx++) {
					if (!check[y + idx][x - idx]) {
						flag = false;
						break;
					}
				}

				if (flag)
					bingo++;

				if (3 <= bingo)
					System.out.println(cnt);
			}
		}
	}
}
