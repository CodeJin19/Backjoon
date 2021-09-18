import java.io.*;
import java.util.*;

public class Main {
	public static int round(int sum, int n) {
		double x = Math.abs(sum);
		x /= n;
		x *= 10;
		int ret = (int) x;
		int r = ret % 10;
		ret /= 10;

		if (r < 5)
			if (0 <= sum)
				return ret;
			else
				return (0 - ret);
		else if (0 <= sum)
			return (ret + 1);
		else
			return (0 - ret - 1);
	}

	public static int get(HashMap<Integer, Integer> cache) {
		int max = -1;

		for (int key : cache.keySet())
			if (max < cache.get(key))
				max = cache.get(key);

		ArrayList<Integer> tmp = new ArrayList<>();

		for (int key : cache.keySet())
			if (cache.get(key) == max)
				tmp.add(key);

		Collections.sort(tmp);

		if (tmp.size() == 1)
			return tmp.get(0);
		else
			return tmp.get(1);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] list = new int[n];
		int sum = 0;
		int cnt;
		HashMap<Integer, Integer> cache = new HashMap<>();

		for (int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(reader.readLine());

			sum += list[i];

			if (cache.containsKey(list[i])) {
				cnt = cache.get(list[i]);
				cache.put(list[i], cnt + 1);
			} else {
				cache.put(list[i], 1);
			}
		}

		Arrays.sort(list);

		System.out.println(round(sum, n));
		System.out.println(list[n / 2]);
		System.out.println(get(cache));
		System.out.println(list[n - 1] - list[0]);
	}
}
