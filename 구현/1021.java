import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] list = new int[n];

		for (int i = 0; i < n; i++)
			list[i] = i + 1;

		int cnt = 0;
		int header = 0;
		int next;
		int survive = n;
		st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < m; i++) {
			next = Integer.parseInt(st.nextToken());

			if (list[header] == next) {
				list[header] = -1;
				survive--;

				if (0 < survive) {
					while (list[header] == -1) {
						header++;

						if (header == n)
							header = 0;
					}
				}
			} else {
				int idx = header;
				int right = 0;
				int left = 0;

				while (list[idx] != next) {
					idx++;

					if (idx == n)
						idx = 0;

					if (list[idx] != -1)
						right++;
				}

				idx = header;

				while (list[idx] != next) {
					idx--;

					if (idx < 0)
						idx = n - 1;

					if (list[idx] != -1)
						left++;
				}

				cnt += Math.min(left, right);
				header = idx;
				list[header] = -1;

				survive--;

				if (0 < survive) {
					while (list[header] == -1) {
						header++;

						if (header == n)
							header = 0;
					}
				}
			}
		}

		System.out.println(cnt);
	}
}
