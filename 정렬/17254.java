import java.io.*;
import java.util.*;

public class Main {
	static class Keyboard implements Comparable<Keyboard> {
		private int a, b;
		private char c;

		public Keyboard(int a, int b, char c) {
			super();
			this.a = a;
			this.b = b;
			this.c = c;
		}

		@Override
		public String toString() {
			return c + "";
		}

		@Override
		public int compareTo(Keyboard o) {
			if (this.b == o.b) {
				return this.a - o.a;
			} else {
				return this.b - o.b;
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		Keyboard[] keyboards = new Keyboard[m];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(reader.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			char c = st.nextToken().charAt(0);

			keyboards[i] = new Keyboard(a, b, c);
		}

		Arrays.sort(keyboards);
		StringBuilder ans = new StringBuilder();

		for (int i = 0; i < m; i++)
			ans.append(keyboards[i]);

		System.out.println(ans);
	}
}
