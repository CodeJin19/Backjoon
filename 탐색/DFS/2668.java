import java.io.*;
import java.util.ArrayList;

public class Main {
	static int list[];
	static boolean visit[];
	static boolean isCycle[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		list = new int[n + 1];
		visit = new boolean[n + 1];
		isCycle = new boolean[n + 1];

		for (int i = 1; i <= n; i++)
			list[i] = Integer.parseInt(reader.readLine());

		for (int i = 1; i <= n; i++) {
			if (!visit[i]) {
				visit[i] = true;
				ArrayList<Integer> cache = new ArrayList<Integer>();
				cache.add(i);
				check(i, cache);
			}
		}

		StringBuilder sb = new StringBuilder();
		int ans = 0;

		for (int i = 1; i <= n; i++) {
			if (isCycle[i]) {
				ans++;
				sb.append(i).append("\n");
			}
		}

		System.out.println(ans);
		System.out.println(sb);
	}

	private static void check(int now, ArrayList<Integer> cache) {
		int next = list[now];

		if (visit[next]) {
			int len = cache.size();
			int idx;

			for (idx = 0; idx < len; idx++) {
				if (cache.get(idx) == next) {
					break;
				}
			}

			if (idx < len) {
				for (; idx < len; idx++) {
					isCycle[cache.get(idx)] = true;
				}
			}

			return;
		} else {
			visit[next] = true;
			cache.add(next);
			check(next, cache);
		}
	}
}
