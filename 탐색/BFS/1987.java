import java.io.*;

public class Main {

	public static int max(int y, int x) {
		if (y < x)
			return x;
		else
			return y;
	}

	public static int solve(int y, int x, int cnt, char[][] fld, boolean[] list) {
		int ret = ++cnt;
		list[(int) (fld[y][x] - 'A')] = true;

		if (0 < y && !list[(int) (fld[y - 1][x] - 'A')])
			ret = max(ret, solve(y - 1, x, cnt, fld, list));
		if (0 < x && !list[(int) (fld[y][x - 1] - 'A')])
			ret = max(ret, solve(y, x - 1, cnt, fld, list));
		if (y < fld.length - 1 && !list[(int) (fld[y + 1][x] - 'A')])
			ret = max(ret, solve(y + 1, x, cnt, fld, list));
		if (x < fld[0].length - 1 && !list[(int) (fld[y][x + 1] - 'A')])
			ret = max(ret, solve(y, x + 1, cnt, fld, list));

		list[(int) (fld[y][x] - 'A')] = false;

		return ret;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		char fld[][];
		boolean cache[] = new boolean[30];
		int r, c, y, x;

		r = Integer.parseInt(str.split(" ")[0]);
		c = Integer.parseInt(str.split(" ")[1]);
		fld = new char[r][c];

		for (int i = 0; i < r; i++) {
			str = reader.readLine();

			for (int j = 0; j < c; j++)
				fld[i][j] = str.charAt(j);
		}

		for (int i = 0; i < 30; i++)
			cache[i] = false;

		y = 0;
		x = 0;

		System.out.println(solve(y, x, 0, fld, cache));
	}
}
