import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int num = Integer.parseInt(st.nextToken());

			if (num == 0) {
				if (queue.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(queue.poll()).append("\n");
				}
			} else {
				for (int j = 0; j < num; j++) {
					int tmp = Integer.parseInt(st.nextToken());
					queue.offer(tmp);
				}
			}
		}

		System.out.print(sb);
	}
}
