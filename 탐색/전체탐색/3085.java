import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static int[][] d = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		char[][] fld = new char[n][n];

		for (int i = 0; i < n; i++) {
			String str = reader.readLine();

			for (int j = 0; j < n; j++)
				fld[i][j] = str.charAt(j);
		}

		int ans = Integer.MIN_VALUE;

		for (int y = 0; y < n; y++) {
			for (int x = 0; x < n; x++) {
				for (int i = 0; i < 4; i++) {
					int ny = y + d[i][0];
					int nx = x + d[i][1];

					if (ny < 0 || n <= ny || nx < 0 || n <= nx || fld[ny][nx] == fld[y][x])
						continue;

					char tmp = fld[ny][nx];
					fld[ny][nx] = fld[y][x];
					fld[y][x] = tmp;
					
					ans = Math.max(ans, getMax(fld));

					tmp = fld[ny][nx];
					fld[ny][nx] = fld[y][x];
					fld[y][x] = tmp;
				}
			}
		}

		System.out.println(ans);
	}

	static int getMax(char[][] fld) {
		int n = fld.length;
		int ret = 0;

		for (int y = 0; y < n; y++) {
			for (int x = 0; x < n; x++) {
				for (int i = 0; i < 4; i++) {
					int ny = y;
					int nx = x;
					int cnt = 0;
                    
					while (true) {
						cnt++;

						ny += d[i][0];
						nx += d[i][1];

						if (ny < 0 || n <= ny || nx < 0 || n <= nx || fld[y][x] != fld[ny][nx])
							break;
					}

					ret = Math.max(ret, cnt);
				}
			}
		}

		return ret;
	}
}
