import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int wine[] = new int[n];
		int cache[][] = new int[n][3];

		for (int i = 0; i < n; i++)
			wine[i] = Integer.parseInt(reader.readLine());

		cache[0][1] = wine[0];

		for (int i = 1; i < n; i++) {
			cache[i][0] = Math.max(cache[i - 1][0], Math.max(cache[i - 1][1], cache[i - 1][2]));
			cache[i][1] = cache[i - 1][0] + wine[i];
			cache[i][2] = cache[i - 1][1] + wine[i];
		}

		System.out.println(Math.max(cache[n - 1][0], Math.max(cache[n - 1][1], cache[n - 1][2])));
	}
}
