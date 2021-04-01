import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	private static int fld[][];
	private static int order[][];

	public static int min(int x, int y) {
		if (x < y)
			return x;
		else
			return y;
	}

	public static void rotate(int tmp[][], int sy, int sx, int l) {
		int y, x, fy, fx, ty, tx, tmpVal, dir;

		for (int i = 1; i <= l; i++) {
			y = sy - i;
			x = sx - i;
			fy = y;
			fx = x;
			ty = fy + 2 * i;
			tx = fx + 2 * i;

			tmpVal = tmp[y + 1][x];
			y++;
			dir = 4;

			while (y != sy - i || x != sx - i) {
				switch (dir) {
				case 1:
					if (x + 1 <= tx) {
						tmp[y][x] = tmp[y][x + 1];
						x++;
					} else {
						tmp[y][x] = tmp[y - 1][x];
						y--;
						dir = 2;
					}
					break;
				case 2:
					if (fy <= y - 1) {
						tmp[y][x] = tmp[y - 1][x];
						y--;
					} else {
						tmp[y][x] = tmp[y][x - 1];
						x--;
						dir = 3;
					}
					break;
				case 3:
					if (fx <= x - 1) {
						tmp[y][x] = tmp[y][x - 1];
						x--;
					} else {
						tmp[y][x] = tmp[y + 1][x];
						y++;
						dir = 4;
					}
					break;
				case 4:
					if (y + 1 <= ty) {
						tmp[y][x] = tmp[y + 1][x];
						y++;
					} else {
						tmp[y][x] = tmp[y][x + 1];
						x++;
						dir = 1;
					}
					break;
				}
			}

			tmp[y][x] = tmpVal;
		}
	}

	public static int solve(int list[]) {
		int tmp[][] = new int[fld.length][fld[0].length];
		int sum, min = 2112345678;

		for (int y = 0; y < fld.length; y++)
			for (int x = 0; x < fld[0].length; x++)
				tmp[y][x] = fld[y][x];

		for (int i = 0; i < list.length; i++)
			rotate(tmp, order[list[i]][0] - 1, order[list[i]][1] - 1, order[list[i]][2]);

		for (int i = 0; i < tmp.length; i++) {
			sum = 0;

			for (int j = 0; j < tmp[i].length; j++) {
				sum += tmp[i][j];
				
				if(min < sum)
					break;
			}

			if (sum < min)
				min = sum;
		}
		
		return min;
	}

	public static int getFact(int list[], boolean isUsed[], int idx) {
		if (idx == list.length) {
			return solve(list);
		}

		int ret = 2112345678;

		for (int i = 0; i < list.length; i++) {
			if (!isUsed[i]) {
				isUsed[i] = true;
				list[idx] = i;
				ret = min(ret, getFact(list, isUsed, idx + 1));
				isUsed[i] = false;
			}
		}

		return ret;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str;
		int n, m, k;
		boolean isUsed[];

		str = reader.readLine();
		st = new StringTokenizer(str, " ");

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		fld = new int[n][m];
		order = new int[k][3];
		isUsed = new boolean[k];

		for (int i = 0; i < n; i++) {
			str = reader.readLine();
			st = new StringTokenizer(str, " ");

			for (int j = 0; j < m; j++)
				fld[i][j] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < k; i++) {
			isUsed[i] = false;
			str = reader.readLine();
			st = new StringTokenizer(str, " ");

			for (int j = 0; j < 3; j++) {
				order[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		System.out.println(getFact(new int[k], isUsed, 0));
	}
}
