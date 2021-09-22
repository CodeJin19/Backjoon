import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		HashMap<String, Integer> cache = new HashMap<>();
		int max = 1;

		for (int i = 0; i < n; i++) {
			String title = reader.readLine();

			if (cache.containsKey(title)) {
				int val = cache.get(title) + 1;

				max = Math.max(max, val);

				cache.put(title, val);
			} else {
				cache.put(title, 1);
			}
		}

		String ans = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";

		for (String title : cache.keySet()) {
			int val = cache.get(title);

			if (val == max && ans.compareTo(title) > 0)
				ans = title;
		}

		System.out.println(ans);
	}
}
