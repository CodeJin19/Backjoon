import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();

		for (int itr = 0; itr < test_case; itr++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());

			int s = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());

			int max = t - s;

			max = Math.min(max, doA(s, t, 0, max));
			max = Math.min(max, doB(s, t, 0, max));
            
			sb.append(max).append("\n");
		}

		System.out.print(sb);
	}

	static int doA(int s, int t, int now, int max) {
		if (max < now + 1)
			return Integer.MAX_VALUE;

		s *= 2;
		t += 3;

		if (s == t) {
			return now + 1;
		} else if (t < s) {
			return Integer.MAX_VALUE;
		} else {
			int ret = doA(s, t, now + 1, max);
			ret = Math.min(ret, doB(s, t, now + 1, max));
			return ret;
		}
	}

	static int doB(int s, int t, int now, int max) {
		if (max < now + 1)
			return Integer.MAX_VALUE;

		s++;

		if (s == t) {
			return now + 1;
		} else if (t < s) {
			return Integer.MAX_VALUE;
		} else {
			int ret = doA(s, t, now + 1, max);
			ret = Math.min(ret, doB(s, t, now + 1, max));
			return ret;
		}
	}
}
