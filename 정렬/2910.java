import java.io.*;
import java.util.*;

public class Main {
	static class Node implements Comparable<Node> {
		int num;
		int cnt;
		int order;

		Node(int num, int cnt, int order) {
			this.num = num;
			this.cnt = cnt;
			this.order = order;
		}

		@Override
		public int compareTo(Main.Node o) {
			if (this.cnt == o.cnt) {
				return this.order - o.order;
			} else {
				return o.cnt - this.cnt;
			}
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		HashMap<Integer, int[]> map = new HashMap<>();
		st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());

			if (map.containsKey(num)) {
				int[] tmp = map.get(num);
				tmp[1]++;
				map.put(num, tmp);
			} else {
				int[] tmp = { i, 1 };
				map.put(num, tmp);
			}
		}

		Node[] list = new Node[map.size()];
		int idx = 0;

		for (int key : map.keySet()) {
			int[] tmp = map.get(key);
			Node newNode = new Node(key, tmp[1], tmp[0]);
			list[idx++] = newNode;
		}

		Arrays.sort(list);

		for (int i = 0; i < list.length; i++) {
			int len = list[i].cnt;

			for (int j = 0; j < len; j++) {
				System.out.print(list[i].num + " ");
			}
		}
		System.out.println();
	}
}
