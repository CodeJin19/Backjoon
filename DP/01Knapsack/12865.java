import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int weight[] = new int[n];
		int value[] = new int[n];
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());
			weight[i] = Integer.parseInt(st.nextToken());
			value[i] = Integer.parseInt(st.nextToken());

			max = Math.max(max, weight[i]);
		}

		int dp[][] = new int[n][k + 1];

		for (int j = 0; j < k + 1; j++)
			if (weight[0] <= j)
				dp[0][j] = value[0];

		for (int i = 1; i < n; i++)
			for (int j = 0; j < k + 1; j++)
				if (weight[i] <= j)
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i]] + value[i]);
				else
					dp[i][j] = dp[i - 1][j];
        
		System.out.println(dp[n - 1][k]);
	}
}
