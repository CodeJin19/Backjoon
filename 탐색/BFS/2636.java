import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		Queue<int[]> queue, nextQueue;
		int fld[][];
		int d[][] = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		int cntBefore, cnt, x, y, nx, ny, time;
		boolean cache[][];

		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		fld = new int[h][w];
		cache = new boolean[h][w];
		cnt = 0;

		for (int i = 0; i < h; i++) {
			st = new StringTokenizer(reader.readLine());

			for (int j = 0; j < w; j++) {
				fld[i][j] = Integer.parseInt(st.nextToken());

				if (fld[i][j] == 1) {
					cnt++;
				}
			}
		}

		queue = new LinkedList<int[]>();
		queue.offer(new int[] { 0, 0 });
		cache[0][0] = true;
		nextQueue = new LinkedList<int[]>();

		while (!queue.isEmpty()) {
			y = queue.peek()[0];
			x = queue.peek()[1];
			queue.poll();

			for (int i = 0; i < 4; i++) {
				ny = y + d[i][0];
				nx = x + d[i][1];

				if (0 <= ny && ny < h && 0 <= nx && nx < w) {
					if (fld[ny][nx] == 0 && !cache[ny][nx]) {
						cache[ny][nx] = true;
						queue.offer(new int[] { ny, nx });
					} else if (fld[ny][nx] == 1 && !cache[ny][nx]) {
						cache[ny][nx] = true;
						nextQueue.offer(new int[] { ny, nx });
					}
				}
			}
		}

		cntBefore = 0;
		time = 0;

		while (cnt != 0) {
			while (!nextQueue.isEmpty())
				queue.offer(nextQueue.poll());

			cntBefore = cnt;
			cnt -= queue.size();
			time++;

			while (!queue.isEmpty()) {
				y = queue.peek()[0];
				x = queue.peek()[1];
				queue.poll();

				for (int i = 0; i < 4; i++) {
					ny = y + d[i][0];
					nx = x + d[i][1];

					if (0 <= ny && ny < h && 0 <= nx && nx < w) {
						if (fld[ny][nx] == 0 && !cache[ny][nx]) {
							cache[ny][nx] = true;
							queue.offer(new int[] { ny, nx });
						} else if (fld[ny][nx] == 1 && !cache[ny][nx]) {
							cache[ny][nx] = true;
							nextQueue.offer(new int[] { ny, nx });
						}
					}
				}
			}
		}

		System.out.println(time);
		System.out.println(cntBefore);
	}
}
