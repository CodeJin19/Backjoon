import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		StringBuilder sb = new StringBuilder();
		ArrayList<String> ans = new ArrayList<String>();
		String list1[], list2[];
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int idx1, idx2, len;

		list1 = new String[n];
		list2 = new String[m];

		for (int i = 0; i < n; i++)
			list1[i] = reader.readLine();

		for (int i = 0; i < m; i++)
			list2[i] = reader.readLine();

		Arrays.sort(list1);
		Arrays.sort(list2);

		idx1 = 0;
		idx2 = 0;

		while (idx1 < n && idx2 < m) {
			if (list1[idx1].equals(list2[idx2])) {
				ans.add(list1[idx1]);
				idx1++;
				idx2++;
			} else if (0 < list1[idx1].compareTo(list2[idx2])) {
				idx2++;
			} else {
				idx1++;
			}
		}

		len = ans.size();
		sb.append(len).append("\n");

		for (int i = 0; i < len; i++)
			sb.append(ans.get(i)).append("\n");

		System.out.println(sb);

	}
}
