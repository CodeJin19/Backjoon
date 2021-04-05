import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static int getGCD(int x, int y) {
		int tmp, r;

		if (y < x) {
			tmp = y;
			y = x;
			x = tmp;
		}

		r = y % x;

		while (r != 0) {
			y = x;
			x = r;
			r = y % x;
		}

		return x;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		StringTokenizer st;
		long sum;
		int T = Integer.parseInt(str);
		int n;
		int list[];

		for (int itr = 0; itr < T; itr++) {
			str = reader.readLine();
			st = new StringTokenizer(str);
			n = Integer.parseInt(st.nextToken());
			list = new int[n];
			sum = 0;

			for (int i = 0; i < n; i++)
				list[i] = Integer.parseInt(st.nextToken());

			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					sum += getGCD(list[i], list[j]);
				}
			}

			System.out.println(sum);
		}
	}
}
