import java.io.*;
import java.util.*;

public class Main {
	static int swap(int num) {
		int cnt = 0;

		while (num != 0) {
			if (num % 10 == 9)
				cnt++;

			num /= 10;
		}

		return cnt;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int fld[][] = new int[n][m];
		int total = 0;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());

			for (int j = 0; j < m; j++) {
				fld[i][j] = swap(Integer.parseInt(st.nextToken()));
				total += fld[i][j];
			}
		}

		int cnt;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			cnt = 0;

			for (int j = 0; j < m; j++)
				cnt += fld[i][j];

			max = Math.max(max, cnt);
		}

		for (int j = 0; j < m; j++) {
			cnt = 0;

			for (int i = 0; i < n; i++)
				cnt += fld[i][j];

			max = Math.max(max, cnt);
		}

		System.out.println(total - max);
	}
}
