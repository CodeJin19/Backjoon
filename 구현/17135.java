import java.io.*;
import java.util.*;

public class Main {

	public static int simulate(int list[], int fld[][], int D) {
		int cnt = 0;
		int x, y;
		boolean isUp;

		for (int t = fld.length - 1; 0 <= t; t--) {
			for (int i = 0; i < 3; i++) {
				if (fld[t][list[i]] == 1) {
					fld[t][list[i]] = 2;
					cnt++;
				} else if (fld[t][list[i]] == 0) {
					for (int d = 1; d < D; d++) {
						x = list[i] - d;
						y = t;
						isUp = true;

						for (int j = 0; j < 2 * d + 1; j++) {
							if (0 <= y && y < fld.length && 0 <= x && x < fld[0].length && 1 <= fld[y][x]) {
								if(fld[y][x] == 1)
									cnt++;
								fld[y][x] = 2;
								d = D;
								break;
							} else if (isUp) {
								if (x == list[i]) {
									isUp = false;
									x++;
									y++;
								} else {
									x++;
									y--;
								}
							} else {
								x++;
								y++;
							}
						}
					}
				}
			}
            
            for(int i = 0; i < fld.length; i++)
                for(int j = 0; j < fld[0].length; j++)
                    if(fld[i][j] == 2)
                        fld[i][j] = 0;
                
                }

		return cnt;
	}

	public static int getComb(int toSelect, int startIdx, int list[], int fld[][], int D) {
		if (toSelect == 3) {
			int n = fld.length;
			int m = fld[0].length;
			int tmp[][] = new int[n][m];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					tmp[i][j] = fld[i][j];
				}
			}

			int x = simulate(list, tmp, D);
			return x;
		}

		int ret = 0;

		for (int i = startIdx; i < fld[0].length; i++) {
			list[toSelect] = i;
			ret = Math.max(ret, getComb(toSelect + 1, i + 1, list, fld, D));
		}

		return ret;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		StringTokenizer st;

		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		int D = Integer.parseInt(str.split(" ")[2]);

		int fld[][] = new int[N][M];

		for (int i = 0; i < N; i++) {
			str = reader.readLine();
			st = new StringTokenizer(str);

			for (int j = 0; j < M; j++)
				fld[i][j] = Integer.parseInt(st.nextToken());
		}

		if (D == 1) {
			int tmp[] = new int[M];

			for (int i = 0; i < M; i++) {
				int sum = 0;

				for (int j = 0; j < N; j++)
					sum += fld[j][i];

				tmp[i] = sum;
			}

			Arrays.sort(tmp);

			System.out.println(tmp[M - 1] + tmp[M - 2] + tmp[M - 3]);
		} else {
			System.out.println(getComb(0, 0, new int[3], fld, D));
		}
	}
}
