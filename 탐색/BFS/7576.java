import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		Queue<int[]> queue = new LinkedList<int[]>();
		int fld[][];
		int d[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		int tmp[];
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int x, y, ny, nx;
		int max = Integer.MIN_VALUE;
		boolean isThere = false;

		fld = new int[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());

			for (int j = 0; j < m; j++) {
				fld[i][j] = Integer.parseInt(st.nextToken());

				if (fld[i][j] == 1)
					queue.offer(new int[] { i, j });
			}
		}

		while (!queue.isEmpty()) {
			tmp = queue.poll();
			y = tmp[0];
			x = tmp[1];

			for (int i = 0; i < 4; i++) {
				ny = y + d[i][0];
				nx = x + d[i][1];

				if (0 <= ny && ny < n && 0 <= nx && nx < m && fld[ny][nx] == 0) {
					fld[ny][nx] = fld[y][x] + 1;
					queue.offer(new int[] { ny, nx });
				}
			}
		}

		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				if (fld[i][j] == 0) {
					isThere = true;
					j = m;
					i = n;
				} else {
					max = Math.max(max, fld[i][j]);
				}

		if (isThere)
			System.out.println(-1);
		else
			System.out.println(max - 1);
	}
}
