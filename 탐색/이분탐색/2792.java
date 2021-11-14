import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] candy = new int[m];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < m; i++) {
			candy[i] = Integer.parseInt(reader.readLine());

			min = Math.min(min, candy[i]);
			max = Math.max(max, candy[i]);
		}

		int l = 1;
		int r = max;
		int ans = max;

		while (l <= r) {
			int mid = (l + r) / 2;

			int childLeft = n;
			int idx = 0;

			while (0 <= childLeft && idx < m) {
				int leftOver = candy[idx] % mid;

				childLeft -= (candy[idx] / mid);

				if (0 < leftOver)
					childLeft--;

				idx++;
			}

			if (0 <= childLeft) {
				ans = Math.min(ans, mid);
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}

		System.out.println(ans);
	}
}
