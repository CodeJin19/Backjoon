import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		long cache[] = new long[36];

		cache[0] = 1;
		cache[1] = 1;
		cache[2] = 2;
		cache[3] = 5;

		for (int i = 4; i <= 35; i++) {
			long sum = 0;

			for (int j = 0; j < i; j++)
				sum += (cache[j] * cache[i - 1 - j]);

			cache[i] = sum;
		}

		System.out.println(cache[n]);
	}
}
