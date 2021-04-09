import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		Queue<int[]> queue = new LinkedList<int[]>();
		int d[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		String str;

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int fld[][] = new int[n + 2][m + 2];
		boolean cache[][] = new boolean[n + 2][m + 2];
		int tmp[];
		int x, y, nx, ny;

		for (int i = 1; i <= n; i++) {
			str = reader.readLine();

			for (int j = 0; j < m; j++)
				fld[i][j + 1] = (int) (str.charAt(j) - '0');
		}

		queue.offer(new int[] { 1, 1 });
		cache[1][1] = true;

		while (!queue.isEmpty()) {
			tmp = queue.poll();
			y = tmp[0];
			x = tmp[1];

			for (int i = 0; i < 4; i++) {
				ny = y + d[i][0];
				nx = x + d[i][1];

				if (1 <= ny && ny <= n && 1 <= nx && nx <= m && fld[ny][nx] != 0 && !cache[ny][nx]) {
					fld[ny][nx] = fld[y][x] + 1;
					cache[ny][nx] = true;
					queue.offer(new int[] { ny, nx });
				}
			}
		}

		System.out.println(fld[n][m]);
	}
}
