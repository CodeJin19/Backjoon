import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> list = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		String str;
		int ans[];
		int n, k, idx = 0, cur = 0;

		str = reader.readLine();
		n = Integer.parseInt(str.split(" ")[0]);
		k = Integer.parseInt(str.split(" ")[1]);
		ans = new int[n];

		for (int i = 1; i <= n; i++)
			list.addLast(i);

		while (idx != n) {
			cur += (k - 1);
			
			while(list.size() <= cur)
				cur -= list.size();

			ans[idx++] = list.get(cur);

			list.remove(cur);
		}

		sb.append("<");
		sb.append(ans[0]);

		for (int i = 1; i < n; i++)
			sb.append(", ").append(ans[i]);

		sb.append(">");

		System.out.println(sb);
	}
}
