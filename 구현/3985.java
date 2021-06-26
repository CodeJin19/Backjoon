import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(reader.readLine());
		int rollcake[] = new int[l + 1];

		int n = Integer.parseInt(reader.readLine());
		int expect[] = new int[n];
		int real[] = new int[n];
		int expactMax = Integer.MIN_VALUE;
		int realMax = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());

			expect[i] = to - from + 1;
			expactMax = Math.max(expactMax, expect[i]);

			for (int j = from; j <= to; j++) {
				if (rollcake[j] == 0) {
					rollcake[j] = (i + 1);
					real[i]++;
				}
			}

			realMax = Math.max(realMax, real[i]);
		}

		for (int i = 0; i < n; i++) {
			if (expect[i] == expactMax) {
				System.out.println(i + 1);
				break;
			}
		}

		for (int i = 0; i < n; i++) {
			if (real[i] == realMax) {
				System.out.println(i + 1);
				break;
			}
		}
	}
}
