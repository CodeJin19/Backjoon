import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());

		StringBuilder sb = new StringBuilder();

		for (int itr = 0; itr < T; itr++) {
			int n = Integer.parseInt(reader.readLine());

			StringTokenizer st = new StringTokenizer(reader.readLine());

			int[] list = new int[n];

			for (int i = 0; i < n; i++)
				list[i] = Integer.parseInt(st.nextToken());

			int max = Integer.MIN_VALUE;

			for (int i = 0; i < n; i++) {
				int sum = 0;

				for (int j = i; j < n; j++) {
					sum += list[j];
					max = Math.max(max, sum);
				}
			}

			sb.append(max).append("\n");
		}

		System.out.println(sb);
	}
}
