import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int d[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		int y, x, sum, ny, nx, cnt, dir;
		int fld[][] = new int[r][c];
		int ac[][] = new int[2][2];
		int next[][];

		for (int i = 0; i < r; i++) {
			st = new StringTokenizer(reader.readLine());

			for (int j = 0; j < c; j++)
				fld[i][j] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < r; i++) {
			if (fld[i][0] == -1) {
				ac[0][0] = i;
				ac[0][1] = 0;
				ac[1][0] = i + 1;
				ac[1][1] = 0;
				break;
			}
		}

		for (int time = 0; time < t; time++) {
			next = new int[r][c];

			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					if (0 < fld[i][j]) {
						cnt = 0;

						for (int idx = 0; idx < 4; idx++) {
							ny = i + d[idx][0];
							nx = j + d[idx][1];

							if (0 <= ny && ny < r && 0 <= nx && nx < c) {
								if (nx != 0 || (ny != ac[0][0] && ny != ac[1][0])) {
									next[ny][nx] += fld[i][j] / 5;
									cnt++;
								}
							}
						}

						next[i][j] += fld[i][j] - ((fld[i][j] / 5) * cnt);
					}
				}
			}

			y = ac[0][0] - 1;
			x = ac[0][1];
			dir = 3;
			next[y][x] = 0;

			while (y != ac[0][0] || x != ac[0][1]) {
				ny = y + d[dir][0];
				nx = x + d[dir][1];

				if (0 <= ny && ny < ac[1][0] && 0 <= nx && nx < c) {
					next[y][x] = next[ny][nx];
					y = ny;
					x = nx;
				} else {
					dir = (dir + 1) % 4;
				}
			}

			y = ac[1][0] + 1;
			x = ac[1][1];
			dir = 1;
			next[y][x] = 0;
			
			while (y != ac[1][0] || x != ac[1][1]) {
				ny = y + d[dir][0];
				nx = x + d[dir][1];

				if (ac[1][0] <= ny && ny < r && 0 <= nx && nx < c) {
					next[y][x] = next[ny][nx];
					y = ny;
					x = nx;
				} else {
					dir = (dir + 3) % 4;
				}
			}

			fld = next;
		}

		sum = 0;

		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				if (fld[i][j] != -1)
					sum += fld[i][j];

		System.out.println(sum);
	}
}
