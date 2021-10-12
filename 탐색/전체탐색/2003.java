import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] list = new int[n];

		st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < n; i++)
			list[i] = Integer.parseInt(st.nextToken());

		int cnt = 0;

		for (int from = 0; from < n; from++) {
			int sum = list[from];
			int idx = from;

			while (idx + 1 < n && sum < m)
				sum += list[++idx];

			if (sum == m)
				cnt++;
		}

		System.out.println(cnt);
	}
}
