import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());
		int list[] = new int[num];
		int q = 0;

		StringTokenizer st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < num; i++)
			list[i] = Integer.parseInt(st.nextToken());

		Arrays.sort(list);

		for (int k = 1; k <= num; k++) {
			int idx = num - k;

			if (idx == 0) {
				if (k <= list[idx]) {
					q = k;
					break;
				}
			} else {
				if (k <= list[idx] && list[idx - 1] <= k) {
					q = k;
					break;
				}
			}
		}

		System.out.println(q);
	}
}
