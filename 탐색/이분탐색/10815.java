import java.io.*;
import java.util.*;

public class Main {
	static int list[];

	static boolean isThere(int num) {
		int l = 0;
		int r = list.length - 1;
		int mid;

		while (l <= r) {
			mid = (l + r) / 2;

			if (list[mid] == num)
				return true;
			else if (num < list[mid])
				r = mid - 1;
			else
				l = mid + 1;
		}

		return false;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		StringTokenizer st = new StringTokenizer(reader.readLine());

		list = new int[n];

		for (int i = 0; i < n; i++)
			list[i] = Integer.parseInt(st.nextToken());

		Arrays.sort(list);

		int m = Integer.parseInt(reader.readLine());
		st = new StringTokenizer(reader.readLine());
		StringBuilder sb = new StringBuilder();

		int x = Integer.parseInt(st.nextToken());

		if (isThere(x))
			sb.append(1);
		else
			sb.append(0);

		for (int i = 1; i < m; i++) {
			x = Integer.parseInt(st.nextToken());

			sb.append(" ");
			if (isThere(x))
				sb.append(1);
			else
				sb.append(0);
		}

		System.out.println(sb);
	}
}
