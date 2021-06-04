import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static class univ implements Comparable<univ> {
		public int p;
		public int d;

		public univ(int p, int d) {
			super();
			this.p = p;
			this.d = d;
		}

		@Override
		public int compareTo(univ o) {
			if (this.p == o.p)
				return this.d - o.d;
			else
				return o.p - this.p;
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(reader.readLine());
		univ list[] = new univ[n];
		int cache[];
		int d, p, idx, sum, max;

		max = -1;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());
			p = Integer.parseInt(st.nextToken());
			d = Integer.parseInt(st.nextToken());

			list[i] = new univ(p, d);
			max = Math.max(max, d);
		}

		Arrays.sort(list);
		cache = new int[max + 1];

		for (int i = 0; i < n; i++) {
			idx = list[i].d;
			p = list[i].p;

			while (0 < idx && 0 < cache[idx])
				idx--;
			
			if(idx != 0)
				cache[idx] = p;
		}

		sum = 0;

		for (int i = 1; i < max + 1; i++)
			sum += cache[i];

		System.out.println(sum);
	}
}
