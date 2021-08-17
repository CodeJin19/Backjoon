import java.io.*;
import java.util.*;

public class Main {
	static int cnt[];

	static boolean isSpecial(int num) {
		int dup = num;
		int test = 0;

		while (dup != 0) {
			test *= 10;
			test += (dup % 10);
			dup /= 10;
		}
		
		if (test != num)
			return false;

		double root = Math.sqrt(num);
		int x = (int) root;

		if (x * x != num)
			return false;

		dup = x;
		test = 0;

		while (dup != 0) {
			test *= 10;
			test += (dup % 10);
			dup /= 10;
		}
		
		if (test != x)
			return false;
		else
			return true;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		cnt = new int[1010];
		StringBuilder sb = new StringBuilder();

		cnt[1] = 1;
		int limit = 2;

		for (int itr = 1; itr <= T; itr++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			while (limit <= b) {
				cnt[limit] = cnt[limit - 1];

				if (isSpecial(limit))
					cnt[limit]++;

				limit++;
			}

			int ans = cnt[b] - cnt[a - 1];

			sb.append("Case #").append(itr).append(": ").append(ans).append("\n");
		}

		System.out.print(sb);
	}
}
