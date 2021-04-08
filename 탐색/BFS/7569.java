import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		Queue<int[]> queue = new LinkedList<int[]>();
		int fld[][][];
		int d[][] = { { 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 }, { 0, 0, -1 }, { 0, -1, 0 }, { -1, 0, 0 } };
		int tmp[];
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int x, y, z, ny, nx, nz;
		int max = Integer.MIN_VALUE;
		boolean isThere = false;

		fld = new int[h][n][m];

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(reader.readLine());

				for (int k = 0; k < m; k++) {
					fld[i][j][k] = Integer.parseInt(st.nextToken());

					if (fld[i][j][k] == 1)
						queue.offer(new int[] { i, j, k });
				}
			}
		}

		while (!queue.isEmpty()) {
			tmp = queue.poll();
			z = tmp[0];
			y = tmp[1];
			x = tmp[2];

			for (int i = 0; i < 6; i++) {
				nz = z + d[i][0];
				ny = y + d[i][1];
				nx = x + d[i][2];

				if (0 <= nz && nz < h && 0 <= ny && ny < n && 0 <= nx && nx < m && fld[nz][ny][nx] == 0) {
					fld[nz][ny][nx] = fld[z][y][x] + 1;
					queue.offer(new int[] { nz, ny, nx });
				}
			}
		}

		for (int i = 0; i < h; i++)
			for (int j = 0; j < n; j++)
				for (int k = 0; k < m; k++)
					if (fld[i][j][k] == 0) {
						isThere = true;
						i = h;
						j = n;
						k = m;
					} else {
						max = Math.max(max, fld[i][j][k]);
					}

		if (isThere)
			System.out.println(-1);
		else
			System.out.println(max - 1);
	}
}
