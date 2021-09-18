import java.io.*;
import java.util.*;

public class Main {
	public static long pow(int x, int y) {
		if (y == 0)
			return 1;

		long ans = 1;
		int cnt = 1;

		while (cnt <= y) {
			ans *= x;
			ans %= 1234567891;
			cnt++;
		}

		return ans;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		String str = reader.readLine();
		long sum = 0;

		for (int i = 0; i < n; i++) {
			long x = (long) (str.charAt(i) - 'a' + 1);
			x *= pow(31, i);
			x %= 1234567891;
			sum += x;
		}

		System.out.println(sum % 1234567891);
	}
}
