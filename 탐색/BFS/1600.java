import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Queue<int[]> queue = new LinkedList<int[]>();
		int fld[][];
		int d1[][] = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		int d2[][] = new int[][] { { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 }, { -1, -2 }, { -2, -1 }, { -2, 1 },
				{ -1, 2 } };
		int k, h, w, move, min, x, y, nx, ny;
		boolean cache[][][];
		boolean reached = false;

		k = Integer.parseInt(reader.readLine());
		st = new StringTokenizer(reader.readLine());
		w = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());

		fld = new int[h][w];
		cache = new boolean[h][w][k + 1];
		min = Integer.MAX_VALUE;

		for (int i = 0; i < h; i++) {
			st = new StringTokenizer(reader.readLine());

			for (int j = 0; j < w; j++)
				fld[i][j] = Integer.parseInt(st.nextToken());
		}

		queue.offer(new int[] { 0, 0, 0, k });

		while (!queue.isEmpty()) {
			y = queue.peek()[0];
			x = queue.peek()[1];
			move = queue.peek()[2];
			k = queue.peek()[3];
			queue.poll();

			if (y == h - 1 && x == w - 1) {
				reached = true;
				min = Math.min(min, move);
			}

			if (0 < k) {
				for (int i = 0; i < 8; i++) {
					ny = y + d2[i][0];
					nx = x + d2[i][1];

					if (0 <= ny && ny < h && 0 <= nx && nx < w && fld[ny][nx] != 1 && !cache[ny][nx][k - 1]) {
						cache[ny][nx][k - 1] = true;
						queue.offer(new int[] { ny, nx, move + 1, k - 1 });
					}
				}
			}

			for (int i = 0; i < 4; i++) {
				ny = y + d1[i][0];
				nx = x + d1[i][1];

				if (0 <= ny && ny < h && 0 <= nx && nx < w && fld[ny][nx] != 1 && !cache[ny][nx][k]) {
					cache[ny][nx][k] = true;
					queue.offer(new int[] { ny, nx, move + 1, k });
				}
			}
		}

		if (reached)
			System.out.println(min);
		else
			System.out.println(-1);
	}
}