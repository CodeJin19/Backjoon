import java.io.*;
import java.util.*;

public class Main {

	public static int solve(int N, int y, int x) {
		if (N == 1)
			if (y == 0)
				if (x == 0)
					return 0;
				else
					return 1;
			else if (x == 0)
				return 2;
			else
				return 3;

		int unit = (int) (Math.pow(2, N - 1));
		int ret = 0;

		if (y < unit)
			if (x < unit)
				ret += solve(N - 1, y, x);
			else
				ret += (unit * unit) + solve(N - 1, y, x - unit);
		else if (x < unit)
			ret += 2 * (unit * unit) + solve(N - 1, y - unit, x);
		else
			ret += 3 * (unit * unit) + solve(N - 1, y - unit, x - unit);

		return ret;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int r = Integer.parseInt(str.split(" ")[1]);
		int c = Integer.parseInt(str.split(" ")[2]);

		System.out.println(solve(N, r, c));
	}
}
