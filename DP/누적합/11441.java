import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		int[] list = new int[n];
		int[] subSum = new int[n + 1];
		StringTokenizer st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < n; i++)
			list[i] = Integer.parseInt(st.nextToken());

		subSum[0] = 0;

		for (int i = 0; i < n; i++)
			subSum[i + 1] = subSum[i] + list[i];

		int m = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(reader.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());

			sb.append(subSum[to] - subSum[(from - 1)]).append("\n");
		}

		System.out.print(sb);
	}
}
