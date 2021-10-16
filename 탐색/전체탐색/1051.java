import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] fld = new int[n][m];
		int ans = 1;

		for (int i = 0; i < n; i++) {
			String str = reader.readLine();

			for (int j = 0; j < m; j++)
				fld[i][j] = (int) (str.charAt(j) - '0');
		}

		for (int y = 0; y < n; y++) {
			for (int x = 0; x < m; x++) {
				int len = Math.min(n - 1 - y, m - 1 - x);

				for (int l = ans; l <= len; l++)
					if (fld[y][x] == fld[y + l][x] && fld[y][x] == fld[y][x + l] && fld[y][x] == fld[y + l][x + l])
						ans = l + 1;
			}
		}

		System.out.println(ans * ans);
	}
}
