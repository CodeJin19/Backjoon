import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());

		int[] list = new int[n];
		st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < n; i++)
			list[i] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(list);

		int cnt = 0;
		int idx = 0;

		while (idx < n) {
			int from = list[idx];

			cnt++;

			while (idx + 1 < n && list[idx + 1] <= from + l - 1)
				idx++;

			idx++;
		}

		System.out.println(cnt);
	}
}
