import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(reader.readLine());

		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());

		int e;
		int f = getLCM(b, d);

		e = a * (f / b) + c * (f / d);

		int g = getGCD(e, f);

		System.out.println((e / g) + " " + (f / g));
	}

	static int getLCM(int y, int x) {
		if (y < x) {
			int tmp = y;
			y = x;
			x = tmp;
		}

		int dy = y;
		int dx = x;
		int r = y % x;

		while (r != 0) {
			y = x;
			x = r;
			r = y % x;
		}

		int ret = dy / x * dx;

		return ret;
	}

	static int getGCD(int y, int x) {
		if (y < x) {
			int tmp = y;
			y = x;
			x = tmp;
		}

		int r = y % x;

		while (r != 0) {
			y = x;
			x = r;
			r = y % x;
		}

		return x;
	}
}
