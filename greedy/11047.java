import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] list = new int[n];

		for (int i = 0; i < n; i++)
			list[i] = Integer.parseInt(reader.readLine());

		int idx = n - 1;
		int cnt = 0;

		while (k < list[idx])
			idx--;

		while (k != 0) {
			int x = k / list[idx];

			cnt += x;
			k -= (x * list[idx]);

			idx--;
		}

		System.out.println(cnt);
	}
}
