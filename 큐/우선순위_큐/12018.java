import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] minPoint = new int[n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());

			int p = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			int[] tmp = new int[p];

			st = new StringTokenizer(reader.readLine());

			for (int j = 0; j < p; j++)
				tmp[j] = Integer.parseInt(st.nextToken());

			Arrays.sort(tmp);

			if (p < l)
				minPoint[i] = 1;
			else
				minPoint[i] = tmp[p - l];
		}

		Arrays.sort(minPoint);
		int cnt = 0;
		int idx = 0;

		while (idx < n && 0 < m) {
			if (minPoint[idx] <= m && minPoint[idx] <= 36) {
				m -= minPoint[idx++];
				cnt++;
			} else {
				break;
			}
		}

		System.out.println(cnt);
	}
}
