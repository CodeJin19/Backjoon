import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		int[] list = new int[n];
		int sum = 0;
		StringTokenizer st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
			sum += list[i];
		}

		Arrays.sort(list);
		int ans = 0;
		int idx = 0;
		int sumTmp = -1;
		int prev = -1;

		while (true) {
			while (idx < n && list[idx] == prev)
				idx++;

			if (idx == n)
				break;

			prev = list[idx];
			sumTmp = 0;

			for (int i = 0; i < n; i++) {
				if (i != idx)
					sumTmp += Math.abs(list[i] - list[idx]);

				if (sum <= sumTmp)
					break;
			}

			if (sumTmp < sum) {
				sum = sumTmp;
				ans = list[idx];
			} else {
				break;
			}
		}

		System.out.println(ans);
	}
}
