import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int d[][] = { {0, 0}, { 1, -1 }, { 1, 0 }, { 1, 1 }, { 0, -1 }, { 0, 0 }, { 0, 1 }, { -1, -1 }, { -1, 0 },
			{ -1, 1 } };

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(reader.readLine());
		String str;
		ArrayList<int[]> now = new ArrayList<int[]>();
		int fld[][];
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int iy, ix, y, x, ny, nx, l, len, idx, min, dir;
		boolean flag = true;

		fld = new int[R][C];
		iy = 0;
		ix = 0;

		for (int i = 0; i < R; i++) {
			str = reader.readLine();

			for (int j = 0; j < C; j++) {
				if (str.charAt(j) == '.') {
					fld[i][j] = 0;
				} else if (str.charAt(j) == 'I') {
					fld[i][j] = -1;
					iy = i;
					ix = j;
				} else if (str.charAt(j) == 'R') {
					fld[i][j] = 1;
					now.add(new int[] { i, j });
				}
			}
		}

		str = reader.readLine();
		len = str.length();

		for (idx = 0; idx < len; idx++) {
			ny = iy + d[str.charAt(idx) - '0'][0];
			nx = ix + d[str.charAt(idx) - '0'][1];

			if (0 < fld[ny][nx]) {
				flag = false;
				break;
			} else {
				fld[iy][ix] = 0;
				fld[ny][nx] = -1;

				iy = ny;
				ix = nx;
			}

			l = now.size();

			for (int i = 0; i < l; i++) {
				y = now.get(i)[0];
				x = now.get(i)[1];
				dir = 0;

				min = Math.abs(y - iy) + Math.abs(x - ix);

				for (int j = 1; j <= 9; j++) {
					ny = y + d[j][0];
					nx = x + d[j][1];

					if (ny < 0 || R <= ny || nx < 0 || C <= nx)
						continue;

					if (Math.abs(ny - iy) + Math.abs(nx - ix) < min) {
						dir = j;
						min = Math.abs(ny - iy) + Math.abs(nx - ix);
					}
				}

				ny = y + d[dir][0];
				nx = x + d[dir][1];
				
				if (ny == iy && nx == ix) {
					flag = false;
					break;
				} else {
					fld[y][x] -= 1;
					fld[ny][nx] += 1;
				}
			}

			if (!flag)
				break;

			now = new ArrayList<int[]>();

			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {
					if (1 < fld[i][j])
						fld[i][j] = 0;
					else if (fld[i][j] == 1)
						now.add(new int[] { i, j });
				}
			}
		}

		if (flag) {
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {
					if (fld[i][j] == 0)
						sb.append(".");
					else if (fld[i][j] == -1)
						sb.append("I");
					else
						sb.append("R");
				}

				sb.append("\n");
			}

			System.out.print(sb);
		} else {
			System.out.println("kraj " + (idx + 1));
		}
	}
}
