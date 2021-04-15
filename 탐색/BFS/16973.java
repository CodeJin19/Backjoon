import java.io.*;
import java.util.*;

public class Main {
	static int n, m, h, w, sx, sy, fx, fy;
	static int[][] fld;
	static boolean[][] visit;

	static boolean able(int y, int x, int dir) {
		if (y < 0 || n - h < y || x < 0 || m - w < x)
			return false;

		if (visit[y][x])
			return false;

		switch (dir) {
		case 0:
			for (int i = 0; i < h; i++)
				if (fld[y + i][x + w - 1] == 1)
					return false;
			break;
		case 1:
			for (int i = 0; i < w; i++)
				if (fld[y + h - 1][x + i] == 1)
					return false;
			break;
		case 2:
			for (int i = 0; i < h; i++)
				if (fld[y + i][x] == 1)
					return false;
			break;
		case 3:
			for (int i = 0; i < w; i++)
				if (fld[y][x + i] == 1)
					return false;
			break;
		}

		return true;
	}

	static int solve() {
		Queue<int[]> queue = new LinkedList<int[]>();
		int[][] d = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		int x, y, nx, ny, cnt;

		queue.offer(new int[] { sy, sx, 0 });

		while (!queue.isEmpty()) {
			y = queue.peek()[0];
			x = queue.peek()[1];
			cnt = queue.peek()[2];
			queue.poll();

			if (y == fy && x == fx)
				return cnt;

			for (int i = 0; i < 4; i++) {
				ny = y + d[i][0];
				nx = x + d[i][1];

				if (able(ny, nx, i)) {
					queue.offer(new int[] { ny, nx, cnt + 1 });
					visit[ny][nx] = true;
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		fld = new int[n][m];
		visit = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());

			for (int j = 0; j < m; j++)
				fld[i][j] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(reader.readLine());

		h = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		sy = Integer.parseInt(st.nextToken());
		sx = Integer.parseInt(st.nextToken());
		fy = Integer.parseInt(st.nextToken());
		fx = Integer.parseInt(st.nextToken());

		sy--;
		sx--;
		fy--;
		fx--;
		visit[sy][sx] = true;

		System.out.println(solve());
	}
}
