import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int days, consumption;
		StringBuilder sb = new StringBuilder();

		while (n != 0) {
			days = 0;
			consumption = 0;

			StringTokenizer st = new StringTokenizer(reader.readLine());
			int dPrev = Integer.parseInt(st.nextToken());
			int mPrev = Integer.parseInt(st.nextToken());
			int yPrev = Integer.parseInt(st.nextToken());
			int usagePrev = Integer.parseInt(st.nextToken());

			for (int i = 1; i < n; i++) {
				st = new StringTokenizer(reader.readLine());

				int d = Integer.parseInt(st.nextToken());
				int m = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				int usage = Integer.parseInt(st.nextToken());

				if (isOneDay(dPrev, mPrev, yPrev, d, m, y)) {
					days++;
					consumption += (usage - usagePrev);
				}

				yPrev = y;
				mPrev = m;
				dPrev = d;
				usagePrev = usage;
			}

			sb.append(days).append(" ").append(consumption).append("\n");
			n = Integer.parseInt(reader.readLine());
		}

		System.out.println(sb);
	}

	static boolean isOneDay(int dp, int mp, int yp, int d, int m, int y) {
		if (yp == y) {
			if (mp == m) {
				if (d - dp == 1)
					return true;
			} else if (mp == 1 && dp == 31 && m == 2 && d == 1) {
				return true;
			} else if (mp == 2 && dp == 28 && m == 3 && d == 1) {
				if (y % 100 == 0 || y % 4 != 0)
					return true;
			} else if (mp == 2 && dp == 29 && m == 3 && d == 1) {
				if (y % 4 == 0 && y % 100 != 0)
					return true;
				else if (y % 400 == 0)
					return true;
			} else if (mp == 3 && dp == 31 && m == 4 && d == 1) {
				return true;
			} else if (mp == 4 && dp == 30 && m == 5 && d == 1) {
				return true;
			} else if (mp == 5 && dp == 31 && m == 6 && d == 1) {
				return true;
			} else if (mp == 6 && dp == 30 && m == 7 && d == 1) {
				return true;
			} else if (mp == 7 && dp == 31 && m == 8 && d == 1) {
				return true;
			} else if (mp == 8 && dp == 31 && m == 9 && d == 1) {
				return true;
			} else if (mp == 9 && dp == 30 && m == 10 && d == 1) {
				return true;
			} else if (mp == 10 && dp == 31 && m == 11 && d == 1) {
				return true;
			} else if (mp == 11 && dp == 30 && m == 12 && d == 1) {
				return true;
			}
		} else if (y - yp == 1) {
			if (mp == 12 && dp == 31 && m == 1 && d == 1)
				return true;
		}

		return false;
	}
}
