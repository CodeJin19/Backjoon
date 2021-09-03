import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		long num = Long.parseLong(reader.readLine());
		String tmp = "";

		while (num != 0) {
			long r = num % 2;
			num /= 2;

			if (r == (long) 1)
				tmp += "1";
			else
				tmp += "0";
		}

		int len = tmp.length();
		long ans = 0;
		long digit = 1;

		for (int i = 0; i < len; i++) {
			if (tmp.charAt(i) == '1')
				ans += digit;

			digit *= 3;
		}

		System.out.println(ans);
	}
}
