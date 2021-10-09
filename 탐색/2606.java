import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int m = Integer.parseInt(reader.readLine());

		boolean[][] connect = new boolean[n + 1][n + 1];
		boolean[] isInfected = new boolean[n + 1];

		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			connect[x][y] = true;
			connect[y][x] = true;
		}

		Queue<Integer> queue = new LinkedList<>();

		queue.offer(1);
		isInfected[1] = true;
		int cnt = 0;

		while (!queue.isEmpty()) {
			int num = queue.poll();

			for (int i = 1; i <= n; i++) {
				if (connect[num][i] && !isInfected[i]) {
					isInfected[i] = true;
					cnt++;
					queue.offer(i);
				}
			}
		}

		System.out.println(cnt);
	}
}
