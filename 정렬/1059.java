import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int list[] = new int[n + 1];

		StringTokenizer st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < n; i++)
			list[i] = Integer.parseInt(st.nextToken());

		list[n] = 0;

		Arrays.sort(list);

		int num = Integer.parseInt(reader.readLine());

		if (list[0] == num) {
			System.out.println(0);
		} else {
			int from = list[0];
			int to = list[0];
			int ans = 0;

			for (int i = 1; i <= n; i++) {
				to = list[i];

				if (to == num) {
					ans = 0;
					break;
				}

				if (from < num && num < to) {
					ans += ((num - from) * (to - num));
					ans--;
					break;
				}

				from = to;
			}

			System.out.println(ans);
		}
	}
}
