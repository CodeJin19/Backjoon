import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		int[] list = new int[k];
		long min = 1;
		long max = 0;

		for (int i = 0; i < k; i++) {
			list[i] = Integer.parseInt(reader.readLine());
			max = Math.max(max, list[i]);
		}

		long ans = 0;

		while (min <= max) {
			long len = (min + max) / 2;
			int cnt = 0;

			for (int i = 0; i < k; i++)
				cnt += (list[i] / len);

			if (cnt == n) {
				ans = Math.max(ans, len);
				min = len + 1;
			} else if (cnt < n) {
				max = len - 1;
			} else {
				ans = Math.max(ans, len);
				min = len + 1;
			}
		}

		System.out.println(ans);
	}
}
