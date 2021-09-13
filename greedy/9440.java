import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());

		while (n != 0) {
			int list[] = new int[n];
			int zero = 0;

			for (int i = 0; i < n; i++) {
				list[i] = Integer.parseInt(st.nextToken());

				if (list[i] == 0)
					zero++;
			}

			Arrays.sort(list);
			int a = 0;
			int b = 0;
			int idx = zero;
			boolean isA = true;

			a = list[idx++];
			b = list[idx++];

			for (int i = 0; i < zero; i++) {
				if (isA) {
					a *= 10;
					isA = false;
				} else {
					b *= 10;
					isA = true;
				}
			}

			for (; idx < n; idx++) {
				if (isA) {
					a *= 10;
					a += list[idx];
					isA = false;
				} else {
					b *= 10;
					b += list[idx];
					isA = true;
				}
			}

			sb.append((a + b)).append("\n");

			st = new StringTokenizer(reader.readLine());
			n = Integer.parseInt(st.nextToken());
		}

		System.out.println(sb);
	}
}
