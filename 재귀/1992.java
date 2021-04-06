import java.io.*;
import java.util.*;

public class Main {

	public static boolean compressable(int y, int x, int n, int fld[][]) {
		int unit = fld[y][x];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (fld[y + i][x + j] != unit)
					return false;

		return true;
	}

	public static StringBuilder solve(int y, int x, int N, int fld[][]) {
		StringBuilder ret = new StringBuilder();

		if (compressable(y, x, N, fld)) {
			ret.append(fld[y][x]);
			return ret;
		} else {
			N /= 2;
			ret.append("(");
			ret.append(solve(y, x, N, fld));
			ret.append(solve(y, x + N, N, fld));
			ret.append(solve(y + N, x, N, fld));
			ret.append(solve(y + N, x + N, N, fld));
			ret.append(")");
		}

		return ret;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();

		int N = Integer.parseInt(str);
		int fld[][] = new int[N][N];

		for (int i = 0; i < N; i++) {
			str = reader.readLine();

			for (int j = 0; j < N; j++)
				fld[i][j] = str.charAt(j) - '0';
		}

		System.out.println(solve(0, 0, N, fld));
	}
}
