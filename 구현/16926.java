import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int[] solve(int fld[][], int r, int d) {
		int tmp[], ret[];
		int x = 0 + r;
		int y = 0 + r;
		int lx = fld[0].length - 2 * r - 1;
		int ly = fld.length - 2 * r - 1;
		int idx = 0;

		tmp = new int[lx * 2 + ly * 2];
		ret = new int[lx * 2 + ly * 2];

		for (int i = 0; i <= lx; i++)
			tmp[idx++] = fld[y][x++];

		x--;
		y++;

		for (int i = 0; i < ly; i++)
			tmp[idx++] = fld[y++][x];

		y--;
		x--;

		for (int i = 0; i < lx; i++)
			tmp[idx++] = fld[y][x--];

		x++;
		y--;

		for (int i = 0; i < ly - 1; i++)
			tmp[idx++] = fld[y--][x];

		idx = 0;

		for (int i = d; i < tmp.length; i++)
			ret[idx++] = tmp[i];

		for (int i = 0; i < d; i++)
			ret[idx++] = tmp[i];

		return ret;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
		int n, m, r, l, x, y, d, lx, ly, fx, fy, tx, ty, dir;
		int fld[][], ans[][], list[];

		str = reader.readLine();
		st = new StringTokenizer(str, " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		fld = new int[n][m];
		ans = new int[n][m];

		for (int i = 0; i < n; i++) {
			str = reader.readLine();
			st = new StringTokenizer(str, " ");

			for (int j = 0; j < m; j++) {
				fld[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		l = n < m ? n : m;

		for (int i = 0; i < l / 2; i++) {
			x = 0 + i;
			y = 0 + i;
			fx = x;
			fy = y;
			lx = m - 2 * i - 1;
			ly = n - 2 * i - 1;
			tx = fx + lx;
			ty = fy + ly;
			d = r;
			d %= (lx * 2 + ly * 2);
			dir = 1;

			list = solve(fld, i, d);

			for (int j = 0; j < list.length; j++) {
				switch (dir) {
				case 1:
					if (x + 1 <= tx) {
						ans[y][x++] = list[j];
					} else {
						ans[y++][x] = list[j];
						dir = 4;
					}
					break;
				case 2:
					if (fy <= y - 1) {
						ans[y--][x] = list[j];
					} else {
						ans[y][x++] = list[j];
						dir = 1;
					}
					break;
				case 3:
					if (fx <= x - 1) {
						ans[y][x--] = list[j];
					} else {
						ans[y--][x] = list[j];
						dir = 2;
					}
					break;
				case 4:
					if (y + 1 <= ty) {
						ans[y++][x] = list[j];
					} else {
						ans[y][x--] = list[j];
						dir = 3;
					}
					break;
				}
			}

		}

		for (int i = 0; i < n; i++) {
			sb.append(ans[i][0]);
			for (int j = 1; j < m; j++) {
				sb.append(" ").append(ans[i][j]);
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}
}
