import java.io.*;
import java.util.*;

public class Main {
	static int howManyZero(int num) {
		int cnt = 0;

		while (num != 0) {
			int d = num % 10;
			num /= 10;

			if (d == 0)
				cnt++;
		}

		return cnt;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		int cnt[] = new int[1000002];

		cnt[0] = 1;

		for (int i = 1; i < 10; i++)
			cnt[i] = 1;

		cnt[10] = 2;

		StringBuilder sb = new StringBuilder();
		int idx = 11;

		for (int itr = 0; itr < T; itr++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());

			while (idx <= to) {
				cnt[idx] = cnt[idx - 1] + howManyZero(idx);
				idx++;
			}

			if (from == 0)
				sb.append(cnt[to]).append("\n");
			else
				sb.append(cnt[to] - cnt[from - 1]).append("\n");
		}

		System.out.println(sb);
	}
}
