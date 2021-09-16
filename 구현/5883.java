import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int list[] = new int[n];
		int ans = 0;
		ArrayList<Integer> cache = new ArrayList<>();

		for (int i = 0; i < n; i++)
			list[i] = Integer.parseInt(reader.readLine());

		for (int i = 0; i < n; i++) {
			int len = cache.size();
			boolean isThere = false;

			for (int j = 0; j < len; j++) {
				if (cache.get(j) == list[i]) {
					isThere = true;
					break;
				}
			}

			if (!isThere) {
				cache.add(list[i]);
				int cnt = 0;
				int num = -1;

				for (int j = 0; j < n; j++) {
					if (list[j] != list[i]) {
						if (num == -1) {
							num = list[j];
							cnt = 1;
						} else if (num == list[j]) {
							cnt++;
						} else {
							ans = Math.max(ans, cnt);
							num = list[j];
							cnt = 1;
						}
					}
				}
                
                ans = Math.max(ans, cnt);
			}
		}

		System.out.println(ans);
	}
}
