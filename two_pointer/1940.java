import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int m = Integer.parseInt(reader.readLine());
		int[] list = new int[n];

		StringTokenizer st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < n; i++)
			list[i] = Integer.parseInt(st.nextToken());

		Arrays.sort(list);

		int from = 0;
		int to = n - 1;
		int cnt = 0;

		while (m < list[to] + list[from])
			to--;

		while (from < to) {
			if (list[from] + list[to] == m) {
				cnt++;
				to--;
				from++;
			} else if (list[from] + list[to] < m) {
				from++;
			} else {
				to--;
			}
		}

		System.out.println(cnt);
	}
}
