import java.io.*;
import java.util.*;

import sun.java2d.loops.ScaledBlit;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(reader.readLine());
		int a[] = new int[N];
		int b[] = new int[N];

		StringTokenizer st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < N; i++)
			a[i] = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < N; i++)
			b[i] = Integer.parseInt(st.nextToken());

		HashMap<Integer, Integer> cache = new HashMap<>();

		for (int i = 0; i < N; i++) {
			int diff = b[i] - a[i];

			if (cache.containsKey(diff)) {
				int val = cache.get(diff);
				cache.replace(diff, val + 1);
			} else {
				cache.put(diff, 1);
			}
		}

		int max = 0;
		Iterator<Integer> keys = cache.keySet().iterator();
		while (keys.hasNext()) {
			int key = keys.next();
			max = Math.max(max, cache.get(key));
		}

		System.out.println(max);
	}
}
