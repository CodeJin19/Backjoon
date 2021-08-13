import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());

		StringBuilder sb = new StringBuilder();
		int d[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

		for (int itr = 0; itr < T; itr++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			int fld[][] = new int[r + 2][c + 2];

			for (int i = 1; i <= r; i++) {
				String str = reader.readLine();

				for (int j = 1; j <= c; j++)
					fld[i][j] = (int) (str.charAt(j - 1) - '0');
			}

			int sum = 0;

			for (int i = 1; i <= r; i++) {
				for (int j = 1; j <= c; j++) {
					if(0 < fld[i][j]) {
						sum += 2;
						
						for (int k = 0; k < 4; k++) {
							int y = i + d[k][0];
							int x = j + d[k][1];
							
							if(fld[y][x] <= fld[i][j]) {
								sum += (fld[i][j] - fld[y][x]);
							}
						}
					}
				}
			}

			sb.append(sum).append("\n");
		}

		System.out.print(sb);

	}
}
