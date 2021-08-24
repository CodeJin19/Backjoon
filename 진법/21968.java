import java.io.*;
import java.util.*;

public class Main {
	static String toTwo(long num) {
		String ret = "";

		while (num != 0) {
			long r = num % 2;
			ret += r;
			num /= 2;
		}

		return ret;
	}

	static long swap(long num) {
		String str = toTwo(num);
		long ret = 0;
		long d = 1;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1')
				ret += d;
			d *= 3;
		}

		return ret;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();

		for (int itr = 0; itr < T; itr++) {
			long num = Long.parseLong(reader.readLine());
			sb.append(swap(num)).append("\n");
		}

		System.out.print(sb);
	}
}
