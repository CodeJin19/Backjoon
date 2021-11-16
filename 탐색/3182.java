import java.io.*;
import java.util.*;

public class Main {
	static int[] link;
	static int[] length;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		link = new int[n + 1];
		length = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			link[i] = Integer.parseInt(reader.readLine());
			length[i] = -1;
		}

		for (int i = 1; i <= n; i++) {
			if (length[i] == -1) {
				ArrayList<Integer> cache = new ArrayList<>();
				cache.add(i);
				length[i] = search(cache, i);
			}
		}

		int val = Integer.MIN_VALUE;
		int ans = n;

		for (int i = n; 0 < i; i--) {
			if (val <= length[i]) {
				ans = i;
				val = length[i];
			}
		}

		System.out.println(ans);
	}

	static int search(ArrayList<Integer> cache, int now) {
		if (0 < length[now])
			return length[now];

		int len = cache.size();
		int next = link[now];
		int idx = 0;
		int val = 0;
		boolean isCycle = false;

		while (idx < len) {
			if (cache.get(idx) == next) {
				val = len - idx;

				while (idx < len)
					length[cache.get(idx++)] = val;

				isCycle = true;
			}

			idx++;
		}

		if (isCycle) {
			return val;
		} else {
			cache.add(next);
			val = search(cache, next);

			if (length[now] == -1)
				length[now] = val + 1;

			return length[now];
		}
	}
}
