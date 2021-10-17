import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] list = new int[n];

		st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < n; i++)
			list[i] = Integer.parseInt(st.nextToken());

		int sum = 0;

		for (int i = 0; i < k; i++)
			sum += list[i];

		int ans = sum;

		for (int i = k; i < n; i++) {
			sum -= list[i - k];
			sum += list[i];

			ans = Math.max(ans, sum);
		}

		System.out.println(ans);
	}
}
