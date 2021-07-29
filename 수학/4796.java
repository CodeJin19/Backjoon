import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int l = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		int cnt = 1;

		while (l != 0 || p != 0 || v != 0) {
			int n = v / p;
			int r = v % p;
			int ans = n * l;

			if (r <= l)
				ans += r;
			else
				ans += l;

			System.out.println("Case " + cnt + ": " + ans);

			st = new StringTokenizer(reader.readLine());

			l = Integer.parseInt(st.nextToken());
			p = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());

			cnt++;
		}
	}
}
