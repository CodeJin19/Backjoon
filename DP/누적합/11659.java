import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] subSum = new int[n + 1];
		subSum[0] = 0;

		st = new StringTokenizer(reader.readLine());

		for (int i = 1; i <= n; i++) {
			int num = Integer.parseInt(st.nextToken());
			subSum[i] = subSum[i - 1] + num;
		}

		for (int itr = 0; itr < m; itr++) {
			st = new StringTokenizer(reader.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());

			sb.append(subSum[to] - subSum[from - 1]).append("\n");
		}

		System.out.println(sb);
	}
}
