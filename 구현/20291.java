import java.io.*;
import java.util.*;

public class Main {
	static class Node implements Comparable<Node> {
		String str;
		int cnt;

		Node(String str, int cnt) {
			this.str = str;
			this.cnt = cnt;
		}

		@Override
		public int compareTo(Node o) {
			return this.str.compareTo(o.str);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String str = reader.readLine();
			StringBuilder type = new StringBuilder();
			int len = str.length();
			int idx = 0;
			boolean flag = false;

			while (idx < len) {
				if (flag)
					type.append(str.charAt(idx));
				else if (str.charAt(idx) == '.')
					flag = true;
				idx++;
			}

			String typeStr = type.toString();

			if (map.containsKey(typeStr))
				map.put(typeStr, map.get(typeStr) + 1);
			else
				map.put(typeStr, 1);
		}

		Node[] list = new Node[map.size()];
		int idx = 0;

		for (String key : map.keySet())
			list[idx++] = new Node(key, map.get(key));

		Arrays.sort(list);
		StringBuilder ans = new StringBuilder();

		for (int i = 0; i < list.length; i++)
			ans.append(list[i].str).append(" ").append(list[i].cnt).append("\n");

		System.out.print(ans);
	}
}
