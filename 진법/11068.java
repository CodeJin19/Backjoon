import java.io.*;
import java.util.*;

public class Main {
	static String convert(int num, int d) {
		StringBuilder ret = new StringBuilder();

		while (num != 0) {
			int r = num % d;
			num /= d;

			if (r < 10) {
				ret.append(r);
			} else {
				char x = (char) (r - 10 + 'A');
				ret.append(x);
			}
		}

		return ret.toString();
	}

	static boolean isPalindrom(String num) {
		int len = num.length();

		for (int i = 0; i < len / 2; i++)
			if (num.charAt(i) != num.charAt(len - 1 - i))
				return false;

		return true;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());

		for (int itr = 0; itr < T; itr++) {
			int num = Integer.parseInt(reader.readLine());
			boolean flag = false;

			for (int i = 2; i < 65; i++) {
				String x = convert(num, i);

				if (isPalindrom(x)) {
					flag = true;
					break;
				}
			}

			if (flag)
				System.out.println(1);
			else
				System.out.println(0);
		}
	}
}
