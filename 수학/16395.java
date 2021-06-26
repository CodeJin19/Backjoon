import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken()) - 1;
		int k = Integer.parseInt(st.nextToken()) - 1;

		if (n == 0) {
			System.out.println("1");
		} else if (k == 0 || k == n) {
			System.out.println("1");
		} else {
			if (n / 2 <= k)
				k = n - k;

			int fld[][] = new int[n + 1][k + 1];

			fld[1][0] = 1;
			fld[1][1] = 1;

			for (int i = 2; i <= n; i++) {

				fld[i][0] = 1;

				if (i <= k) {
					fld[i][i] = 1;

					for (int j = 1; j < i; j++)
						fld[i][j] = fld[i - 1][j - 1] + fld[i - 1][j];
				} else {
					for (int j = 1; j <= k; j++)
						fld[i][j] = fld[i - 1][j - 1] + fld[i - 1][j];
				}
			}

			System.out.println(fld[n][k]);
		}
	}
}
