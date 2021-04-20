import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		ArrayList<Integer> now = new ArrayList<Integer>();
		ArrayList<Integer> next;
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int len, idx;
		int cache[] = new int[100001];

		for (int i = 0; i < 100001; i++)
			if (i == n)
				cache[i] = 0;
			else
				cache[i] = -1;

		now.add(n);

		while (cache[m] == -1) {
			len = now.size();
			next = new ArrayList<Integer>();

			for (int i = 0; i < len; i++) {
				idx = now.get(i);

				if (0 <= idx - 1 && cache[idx - 1] == -1) {
					cache[idx - 1] = cache[idx] + 1;
					next.add(idx - 1);
				}

				if (idx + 1 <= 100000 && cache[idx + 1] == -1) {
					cache[idx + 1] = cache[idx] + 1;
					next.add(idx + 1);
				}

				if (0 <= idx - a && cache[idx - a] == -1) {
					cache[idx - a] = cache[idx] + 1;
					next.add(idx - a);
				}

				if (idx + a <= 100000 && cache[idx + a] == -1) {
					cache[idx + a] = cache[idx] + 1;
					next.add(idx + a);
				}

				if (0 <= idx - b && cache[idx - b] == -1) {
					cache[idx - b] = cache[idx] + 1;
					next.add(idx - b);
				}

				if (idx + b <= 100000 && cache[idx + b] == -1) {
					cache[idx + b] = cache[idx] + 1;
					next.add(idx + b);
				}

				if (idx * a <= 100000 && cache[idx * a] == -1) {
					cache[idx * a] = cache[idx] + 1;
					next.add(idx * a);
				}

				if (idx * b <= 100000 && cache[idx * b] == -1) {
					cache[idx * b] = cache[idx] + 1;
					next.add(idx * b);
				}
			}
			
			now = next;
		}
		
		System.out.println(cache[m]);
	}
}
