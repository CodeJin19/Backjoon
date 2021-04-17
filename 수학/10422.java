import java.io.*;
import java.util.ArrayList;

public class Main {
	static ArrayList<Integer> cache;
	static ArrayList<Integer> tmp;

	static int get(int num) {
		int l = tmp.size() - 1;

		if (num <= l)
			return cache.get(num / 2);

		while (l <= num) {
			tmp.add(0);
			tmp.add(0);
			l += 2;

			for (int i = 1; i < l; i += 2)
				tmp.set(i, (tmp.get(i - 1) + tmp.get(i + 1)) % 1000000007);

			tmp.set(0, tmp.get(1));
			for (int i = 2; i < l; i += 2)
				tmp.set(i, (tmp.get(i - 1) + tmp.get(i + 1)) % 1000000007);
			tmp.set(l, tmp.get(l - 1));
			
			cache.add(tmp.get(0));
		}

		return cache.get(num / 2);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		int n;

		cache = new ArrayList<Integer>();
		cache.add(0); // 0 : 0 : 1
		cache.add(1); // 1 : 2 : 1
		cache.add(2); // 2 : 4 : 2

		tmp = new ArrayList<Integer>();
		tmp.add(2); // 0
		tmp.add(2); // 1
		tmp.add(3); // 2
		tmp.add(1); // 3
		tmp.add(1); // 4

		for (int i = 0; i < T; i++) {
			n = Integer.parseInt(reader.readLine());

			if (n % 2 == 1)
				System.out.println(0);
			else
				System.out.println(get(n));
		}
	}
}
