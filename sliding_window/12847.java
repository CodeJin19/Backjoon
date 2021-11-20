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

		long sum = 0;

		for (int i = 0; i < m; i++)
			sum += list[i];

		long ans = sum;

		for (int i = m; i < n; i++) {
			sum -= list[i - m];
			sum += list[i];
			ans = Math.max(ans, sum);
		}

		System.out.println(ans);
	}
}
