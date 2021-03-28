import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int dp[] = new int[11];
		int n;
		dp[1] = 0;
		dp[2] = 1;

		for (int i = 3; i < 11; i++) {
			if (i % 2 == 0) {
				dp[i] = (i / 2) * (i / 2) + dp[i / 2] + dp[i / 2];
			} else {
				dp[i] = (i / 2 + 1) * (i / 2) + dp[i / 2 + 1] + dp[i / 2];
			}
		}

		n = Integer.parseInt(reader.readLine());
		System.out.println(dp[n]);
	}
}
