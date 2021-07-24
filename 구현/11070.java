import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());

		for (int itr = 0; itr < T; itr++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			int score[][] = new int[n + 1][2];

			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(reader.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int p = Integer.parseInt(st.nextToken());
				int q = Integer.parseInt(st.nextToken());

				score[a][0] += p;
				score[a][1] += q;
				score[b][0] += q;
				score[b][1] += p;
			}

			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			double val = 0;

			for (int i = 1; i <= n; i++) {
				if (score[i][0] == 0 && score[i][1] == 0) {
					val = 0;
				} else {
					val = score[i][0] * score[i][0];
					val /= (score[i][0] * score[i][0] + score[i][1] * score[i][1]);
					val *= 1000;
				}

				max = Math.max(max, (int) val);
				min = Math.min(min, (int) val);
			}

			System.out.println(max);
			System.out.println(min);
		}
	}
}
