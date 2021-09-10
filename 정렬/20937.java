import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int list[] = new int[n];

		StringTokenizer st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < n; i++)
			list[i] = Integer.parseInt(st.nextToken());

		Arrays.sort(list);

		int num = list[0];
		int cnt = 1;
		int max = 0;

		for (int i = 1; i < n; i++) {
			if (num == list[i]) {
				cnt++;
			} else {
				max = Math.max(max, cnt);
				num = list[i];
				cnt = 1;
			}
		}

		max = Math.max(max, cnt);
		System.out.println(max);
	}
}
