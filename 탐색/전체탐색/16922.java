import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		HashMap<Integer, Integer> cache = new HashMap<>();
		int one = n;
		int five = 0;
		int ten = 0;
		int fifty = 0;

		while (fifty != n) {
			int sum = one + five + ten + fifty;

			if (sum == n) {
				int val = one + 5 * five + 10 * ten + 50 * fifty;

				if (!cache.containsKey(val))
					cache.put(val, 1);
			}

			one++;

			if (n < one) {
				five++;
				one = 0;
			}

			if (n < five) {
				ten++;
				five = 0;
			}

			if (n < ten) {
				fifty++;
				ten = 0;
			}
		}

		System.out.println(cache.size() + 1);
	}
}
