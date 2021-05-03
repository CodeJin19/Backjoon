import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int list[] = new int[n + k - 1];
		int cache[] = new int[d + 1];
		int cnt = 0;
		int now;
		int max = 0;

		for (int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(reader.readLine());

			if (i < k - 1)
				list[n + i] = list[i];
		}
		
		for (int i = 0; i < k; i++) {
			cache[list[i]]++;

			if (cache[list[i]] == 1)
				cnt++;
		}

		max = cnt + (1 <= cache[c] ? 0 : 1);

		for (int i = k; i < n + k - 1; i++) {
			cache[list[i - k]]--;

			if (cache[list[i - k]] == 0)
				cnt--;

			cache[list[i]]++;

			if (cache[list[i]] == 1)
				cnt++;

			now = cnt + (1 <= cache[c] ? 0 : 1);
			
			max = Math.max(max, now);
		}
		
		System.out.println(max);
	}
}
