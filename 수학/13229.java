import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int[] list = new int[n];
		int[] sum = new int[n];

		for (int i = 0; i < n; i++)
			list[i] = Integer.parseInt(st.nextToken());

		sum[0] = list[0];

		for (int i = 1; i < n; i++)
			sum[i] = sum[i - 1] + list[i];

		int m = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(reader.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());

			int val = sum[to];

			if (from != 0)
				val -= sum[from - 1];

			sb.append(val).append("\n");
		}

		System.out.println(sb);
	}
}
