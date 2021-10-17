import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] list = new int[n];

		StringTokenizer st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < n; i++)
			list[i] = Integer.parseInt(st.nextToken());

		Arrays.sort(list);

		int x = Integer.parseInt(reader.readLine());
		int idx1 = 0;
		int idx2 = n - 1;
		int cnt = 0;

		while (idx1 < idx2) {
			if (list[idx1] + list[idx2] == x) {
				cnt++;
				idx1++;
				idx2--;
			} else if (list[idx1] + list[idx2] < x) {
				idx1++;
			} else {
				idx2--;
			}
		}

		System.out.println(cnt);
	}
}
