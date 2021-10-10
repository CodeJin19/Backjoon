import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		BigInteger[] prev = new BigInteger[2];
		BigInteger[] now = new BigInteger[1];

		prev[0] = new BigInteger("1");
		prev[1] = new BigInteger("1");

		for (int i = 2; i <= n; i++) {
			int len = Math.min(m + 1, i + 1);

			now = new BigInteger[len];

			now[0] = new BigInteger("1");

			if (len == i + 1) {
				now[i] = new BigInteger("1");
				len--;
			}

			for (int j = 1; j < len; j++)
				now[j] = prev[j - 1].add(prev[j]);

			prev = now;
		}

		System.out.println(now[m]);
	}
}
