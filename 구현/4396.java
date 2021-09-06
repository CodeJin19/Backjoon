import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		char fld[][] = new char[n][n];
		boolean cache[][] = new boolean[n][n];
		boolean isFailed = false;

		for (int i = 0; i < n; i++) {
			String str = reader.readLine();

			for (int j = 0; j < n; j++)
				fld[i][j] = str.charAt(j);
		}

		for (int i = 0; i < n; i++) {
			String str = reader.readLine();

			for (int j = 0; j < n; j++)
				if (str.charAt(j) == 'x') {
					cache[i][j] = true;
					
					if(fld[i][j] == '*')
						isFailed = true;
				} else {
					cache[i][j] = false;
				}
		}

		StringBuilder sb = new StringBuilder();
		int d[][] = { { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 }, { -1, -1 }, { -1, 0 }, { -1, 1 } };

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(isFailed && fld[i][j] == '*') {
					sb.append("*");
				} else if (cache[i][j]) {
					int cnt = 0;

					for (int k = 0; k < 8; k++) {
						int ny = i + d[k][0];
						int nx = j + d[k][1];

						if (ny < 0 || n <= ny || nx < 0 || n <= nx)
							continue;

						if (fld[ny][nx] == '*')
							cnt++;
					}

					sb.append(cnt);
				} else {
					sb.append(".");
				}
			}
			sb.append("\n");
		}

		System.out.print(sb);
	}
}
