import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		StringTokenizer st = new StringTokenizer(reader.readLine());

		int[] list = new int[n];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
			sum += list[i];
		}

		int m = Integer.parseInt(reader.readLine());

		Arrays.sort(list);

		if (sum <= m) {
			System.out.println(list[n - 1]);
		} else {
			int l = 0;
			int r = list[n - 1];
			int mid, subSum;
			int ans = Integer.MIN_VALUE;

			while (l <= r) {
				mid = (l + r) / 2;
				subSum = 0;

				for (int i = 0; i < n; i++) {
					if (list[i] < mid)
						subSum += list[i];
					else
						subSum += mid;
				}

				if (subSum <= m) {
					ans = Math.max(ans, mid);
					l = mid + 1;
				} else {
					r = mid - 1;
				}
			}

			System.out.println(ans);
		}
	}
}
