import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();

		for (int itr = 0; itr < T; itr++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(reader.readLine());
			int[] list = new int[n];
			int[] order = new int[n];

			for (int i = 0; i < n; i++) {
				list[i] = Integer.parseInt(st.nextToken());
				order[i] = list[i];
			}

			Arrays.sort(order);

			int idx = 0;
			int orderIdx = n - 1;
			int cnt = 1;

			while (true) {
				while (list[idx] != order[orderIdx]) {
					idx++;

					if (idx == n)
						idx = 0;
				}

				if (idx == m)
					break;

				list[idx] = -1;
				orderIdx--;
				cnt++;
			}

			sb.append(cnt).append("\n");
		}

		System.out.println(sb);
	}
}
