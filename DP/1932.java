import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int fld[][];
		int n = Integer.parseInt(reader.readLine());
		int max;

		fld = new int[n][n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());

			for (int j = 0; j <= i; j++) {
				fld[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 1; i < n; i++) {
            fld[i][0] += fld[i - 1][0];

            for (int j = 1; j < i; j++) {
                fld[i][j] += Math.max(fld[i - 1][j - 1], fld[i - 1][j]);
            }

            fld[i][i] += fld[i - 1][i - 1];
        }

        max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, fld[n - 1][i]);
        }

        System.out.println(max);
	}
}
