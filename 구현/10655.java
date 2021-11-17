import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		int[][] list = new int[n][2];
		int sum = 0;

		StringTokenizer st = new StringTokenizer(reader.readLine());
		list[0][0] = Integer.parseInt(st.nextToken());
		list[0][1] = Integer.parseInt(st.nextToken());

		for (int i = 1; i < n; i++) {
			st = new StringTokenizer(reader.readLine());
			list[i][0] = Integer.parseInt(st.nextToken());
			list[i][1] = Integer.parseInt(st.nextToken());

			sum += Math.abs(list[i][0] - list[i - 1][0]) + Math.abs(list[i][1] - list[i - 1][1]);
		}

		int ans = Integer.MAX_VALUE;

		for (int i = 1; i < n - 1; i++) {
			int tmp = sum;

			tmp -= (Math.abs(list[i][0] - list[i - 1][0]) + Math.abs(list[i][1] - list[i - 1][1]));
			tmp -= (Math.abs(list[i + 1][0] - list[i][0]) + Math.abs(list[i + 1][1] - list[i][1]));
			tmp += (Math.abs(list[i + 1][0] - list[i - 1][0]) + Math.abs(list[i + 1][1] - list[i - 1][1]));

			ans = Math.min(ans, tmp);
		}

		System.out.println(ans);
	}
}
