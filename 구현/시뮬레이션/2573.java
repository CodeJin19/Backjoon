import java.io.*;
import java.util.*;

public class Main {
	static int fld[][];
	static int d[][] = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
	static boolean isIceberg[][];

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		fld = new int[n][m];
		isIceberg = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());

			for (int j = 0; j < m; j++) {
				fld[i][j] = Integer.parseInt(st.nextToken());

				if (fld[i][j] != 0)
					isIceberg[i][j] = true;
			}
		}

		int time = 0;
		int num = 1;

		do {
			time++;

			int sub[][] = new int[n][m];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (isIceberg[i][j]) {
						for (int k = 0; k < 4; k++) {
							int ny = i + d[k][0];
							int nx = j + d[k][1];

							if (ny < 0 || n <= ny || nx < 0 || m <= nx || isIceberg[ny][nx])
								continue;

							sub[i][j]++;
						}
					}
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					fld[i][j] -= sub[i][j];

					if (fld[i][j] <= 0) {
						fld[i][j] = 0;
						isIceberg[i][j] = false;
					}
				}
			}

			num = getCnt();
		} while (num == 1);

		if (num == 0)
			System.out.println(0);
		else
			System.out.println(time);
	}

	static int getCnt() {
		boolean visit[][] = new boolean[fld.length][fld[0].length];
		int cnt = 0;

		for (int i = 0; i < fld.length; i++) {
			for (int j = 0; j < fld[i].length; j++) {
				if (isIceberg[i][j] && !visit[i][j]) {
					Queue<int[]> bfs = new LinkedList<int[]>();
					bfs.offer(new int[] { i, j });
					visit[i][j] = true;

					while (!bfs.isEmpty()) {
						int y = bfs.peek()[0];
						int x = bfs.peek()[1];
						bfs.poll();

						for (int k = 0; k < 4; k++) {
							int ny = y + d[k][0];
							int nx = x + d[k][1];

							if (ny < 0 || fld.length <= ny || nx < 0 || fld[0].length <= nx || visit[ny][nx]
									|| !isIceberg[ny][nx])
								continue;

							bfs.offer(new int[] { ny, nx });
							visit[ny][nx] = true;
						}
					}
					
					cnt++;
				}
			}
		}

		return cnt;
	}
}
