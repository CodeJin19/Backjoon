import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();

		for (int itr = 0; itr < T; itr++) {
			int n = Integer.parseInt(reader.readLine());

			if (15 < n) {
				n -= 15;

				int x, r;

				x = n / 14;
				r = n % 14;

				if (r == 0) {
					if(x % 2 == 0)
						n = 15;
					else
						n = 1;
				} else {
					if (x % 2 == 0)
						n = 15 - r;
					else
						n = r + 1;
				}
			}

			sb.append(swap(n)).append("\n");
		}

		System.out.print(sb);
	}

	private static String swap(int num) {
		StringBuilder ret = new StringBuilder();
		int d = 8;

		while (num != 0) {
			if (d <= num) {
				ret.append("딸기");

				num -= d;
			} else {
				ret.append("V");
			}

			d /= 2;
		}

		while (d != 0) {
			ret.append("V");
			d /= 2;
		}

		return ret.toString();
	}
}
