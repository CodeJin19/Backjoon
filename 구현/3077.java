import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		StringTokenizer st = new StringTokenizer(reader.readLine());
		HashMap<String, Integer> map = new HashMap<>();
		int idx = 1;
		int[] ans = new int[n];

		for (int i = 0; i < n; i++)
			map.put(st.nextToken(), idx++);

		st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < n; i++)
			ans[i] = map.get(st.nextElement());

		int cnt = 0;
		int total = n * (n - 1) / 2;

		for (int from = 0; from < n; from++)
			for (int to = from + 1; to < n; to++)
				if (ans[from] < ans[to])
					cnt++;

		System.out.println(cnt + "/" + total);
	}
}
