import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();

		while (n != 0 || m != 0) {
			int[] arr = new int[n];
			int[] brr = new int[m];

			for (int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(reader.readLine());

			for (int i = 0; i < m; i++)
				brr[i] = Integer.parseInt(reader.readLine());

			int adx = 0;
			int bdx = 0;
			int cnt = 0;

			while (adx < n && bdx < m) {
				if (arr[adx] == brr[bdx]) {
					cnt++;
					adx++;
					bdx++;
				} else if (arr[adx] < brr[bdx]) {
					adx++;
				} else {
					bdx++;
				}
			}

			sb.append(cnt).append("\n");
			st = new StringTokenizer(reader.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
		}

		System.out.print(sb);
	}
}
