import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int itr = 1;
		StringBuilder sb = new StringBuilder();

		while (n != 0 || m != 0) {
			int fld[][] = new int[n][m];
			boolean unreachable[][] = new boolean[n][m];

			st = new StringTokenizer(reader.readLine());
			int y = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());

			while (y != 0 || x != 0) {
				unreachable[y][x] = true;

				st = new StringTokenizer(reader.readLine());
				y = Integer.parseInt(st.nextToken());
				x = Integer.parseInt(st.nextToken());
			}

			fld[0][0] = 1;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (!unreachable[i][j]) {
						if (i == 0) {
							if (j != 0)
								fld[i][j] = fld[i][j - 1];
						} else if (j == 0) {
							fld[i][j] = fld[i - 1][j];
						} else {
							if (!unreachable[i][j - 1])
								fld[i][j] += fld[i][j - 1];

							if (!unreachable[i - 1][j])
								fld[i][j] += fld[i - 1][j];
						}
					}
				}
			}

			sb.append("Map ").append(itr++).append(": ").append(fld[n - 1][m - 1]).append("\n");

			st = new StringTokenizer(reader.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
		}

		System.out.print(sb);
	}
}
