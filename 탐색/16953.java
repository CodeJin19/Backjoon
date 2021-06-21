import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		int ans = convert(a, b, 1, Integer.MAX_VALUE);
		
		if(ans == Integer.MAX_VALUE)
			System.out.println(-1);
		else
			System.out.println(ans);
	}

	static int convert(long now, long to, int tmp, int ans) {
		if (ans < tmp || to < now) {
			return Integer.MAX_VALUE;
		}

		if (now == to) {
			return tmp;
		}

		ans = Math.min(ans, convert(now * 2, to, tmp + 1, ans));
		ans = Math.min(ans, convert(now * 10 + 1, to, tmp + 1, ans));

		return ans;
	}
}
