import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		boolean[] cache = new boolean[n + 1];
		int cnt = 0;
		int ans = 0;

		for (int i = 2; i <= n; i++)
			cache[i] = true;

		for (int i = 2; i <= n; i++) {
			if (cache[i]) {
				cnt++;

				if (cnt == m) {
					ans = i;
					break;
				}
			}

			for (int j = i + i; j <= n; j += i) {
				if (cache[j]) {
					cache[j] = false;
					cnt++;

					if (cnt == m) {
						ans = j;
						i = n + 1;
						break;
					}
				}
			}
		}

		System.out.println(ans);
	}
}
