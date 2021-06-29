import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static boolean isHappyPrime[];
	static boolean cache[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(reader.readLine());
		boolean isPrime[] = new boolean[10001];

		for (int i = 2; i < 10001; i++)
			isPrime[i] = true;

		for (int i = 2; i < 10001; i++) {
			if (isPrime[i]) {
				for (int j = i + i; j < 10001;) {
					isPrime[j] = false;
					j += i;
				}
			}
		}

		isHappyPrime = new boolean[10001];
		cache = new boolean[10001];

		isHappyPrime[1] = true;
		cache[1] = true;

		for (int itr = 0; itr < T; itr++) {
			st = new StringTokenizer(reader.readLine());

			int t = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());

			StringBuilder sb = new StringBuilder();
			sb.append(t).append(" ").append(num).append(" ");

			if (isPrime[num]) {
				if (check(num))
					sb.append("YES");
				else
					sb.append("NO");
			} else {
				sb.append("NO");
			}

			System.out.println(sb);
		}
	}

	static boolean check(int num) {
		if (cache[num])
			return isHappyPrime[num];

		cache[num] = true;

		int n = num;
		int d, sum = 0;

		while (n != 0) {
			d = n % 10;
			n /= 10;
			sum += (d * d);
		}

		isHappyPrime[num] = check(sum);
		return isHappyPrime[num];
	}
}
