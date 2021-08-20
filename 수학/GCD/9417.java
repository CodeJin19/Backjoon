import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		for (int itr = 0; itr < T; itr++) {
			st = new StringTokenizer(reader.readLine());
			int num = st.countTokens();
			int list[] = new int[num];
			int max = Integer.MIN_VALUE;

			for (int i = 0; i < num; i++)
				list[i] = Integer.parseInt(st.nextToken());

			for (int i = 0; i < num; i++) {
				for (int j = i + 1; j < num; j++) {
					int gcd = getGCD(list[i], list[j]);
					max = Math.max(max, gcd);
				}
			}

			sb.append(max).append("\n");
		}

		System.out.print(sb);
	}

	private static int getGCD(int x, int y) {
		if (y < x) {
			int tmp = x;
			x = y;
			y = tmp;
		}

		while (x != 0) {
			int r = y % x;
			y = x;
			x = r;
		}

		return y;
	}
}
