import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());

		int[] list = new int[n];

		st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < n; i++)
			list[i] = Integer.parseInt(st.nextToken());

		int sum = 0;

		for (int i = 0; i < x; i++)
			sum += list[i];

		int max = sum;

		for (int i = x; i < n; i++) {
			sum -= list[i - x];
			sum += list[i];

			max = Math.max(max, sum);
		}

		if (max == 0) {
			System.out.println("SAD");
		} else {
			sum = 0;
			int cnt = 0;

			for (int i = 0; i < x; i++)
				sum += list[i];

			if (sum == max)
				cnt++;

			for (int i = x; i < n; i++) {
				sum -= list[i - x];
				sum += list[i];

				max = Math.max(max, sum);

				if (sum == max)
					cnt++;
			}

			System.out.println(max + "\n" + cnt);
		}
	}
}
