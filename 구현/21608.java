import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int fld[][];
	static int d[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

	static class sit implements Comparable<sit> {
		int emptySits;
		int y;
		int x;
		int cnt;

		sit(int y, int x, int cnt, int emptySits) {
			this.y = y;
			this.x = x;
			this.cnt = cnt;
			this.emptySits = emptySits;
		}

		@Override
		public int compareTo(sit o) {
			if (this.cnt == o.cnt) {
				if (this.emptySits == o.emptySits) {
					if (this.y == o.y) {
						return this.x - o.x;
					} else {
						return this.y - o.y;
					}
				} else {
					return o.emptySits - this.emptySits;
				}
			} else {
				return o.cnt - this.cnt;
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		int data[][] = new int[n * n][5];
		int sits[][] = new int[n * n + 1][2];
		fld = new int[n][n];

		for (int i = 0; i < data.length; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());

			for (int j = 0; j < 5; j++)
				data[i][j] = Integer.parseInt(st.nextToken());
		}

		for (int i = 1; i <= n; i++) {
			sits[i][0] = -1;
			sits[i][1] = -1;
		}

		for (int idx = 0; idx < data.length; idx++) {
			int num = data[idx][0];
			PriorityQueue<sit> list = new PriorityQueue<>();

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (fld[i][j] != 0)
						continue;

					int cnt = 0;
					int emptySits = 0;

					for (int k = 0; k < 4; k++) {
						int ny = i + d[k][0];
						int nx = j + d[k][1];

						if (ny < 0 || n <= ny || nx < 0 || n <= nx)
							continue;

						if (fld[ny][nx] == 0)
							emptySits++;
						else if (fld[ny][nx] == data[idx][1] || fld[ny][nx] == data[idx][2]
								|| fld[ny][nx] == data[idx][3] || fld[ny][nx] == data[idx][4])
							cnt++;
					}

					list.add(new sit(i, j, cnt, emptySits));
				}
			}

			int y = list.peek().y;
			int x = list.peek().x;

			fld[y][x] = num;
			sits[num][0] = y;
			sits[num][1] = x;
		}

		int score = 0;

		for (int i = 0; i < n * n; i++) {
			int num = data[i][0];
			int y = sits[num][0];
			int x = sits[num][1];
			int cnt = 0;

			for (int j = 0; j < 4; j++) {
				int ny = y + d[j][0];
				int nx = x + d[j][1];

				if (ny < 0 || n <= ny || nx < 0 || n <= nx)
					continue;

				if (fld[ny][nx] == data[i][1] || fld[ny][nx] == data[i][2] || fld[ny][nx] == data[i][3]
						|| fld[ny][nx] == data[i][4])
					cnt++;
			}

			switch (cnt) {
			case 1:
				score += 1;
				break;
			case 2:
				score += 10;
				break;
			case 3:
				score += 100;
				break;
			case 4:
				score += 1000;
				break;
			}
		}

		System.out.println(score);
	}
}
