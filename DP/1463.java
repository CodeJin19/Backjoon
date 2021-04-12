import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int min;
		int cache[] = new int[n + 1];

		cache[1] = 0;

		for (int i = 2; i <= n; i++) {
			min = cache[i - 1] + 1;

			if (i % 2 == 0)
				min = Math.min(min, cache[i / 2] + 1);

			if (i % 3 == 0)
				min = Math.min(min, cache[i / 3] + 1);

			cache[i] = min;
		}

		System.out.println(cache[n]);
	}
}
