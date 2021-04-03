import java.io.*;
import java.util.*;

public class Main {
	public static int sour[];
	public static int bitter[];
	public static boolean isUsed[];

	public static int min(int x, int y) {
		if (x < y)
			return x;
		else
			return y;
	}

	public static int solve(int toSelect, int startIdx, int cache[]) {
		if (startIdx == sour.length) {
			if (toSelect == 0) {
				return 2112345678;
			} else {
				int s = sour[cache[0]];
				int b = bitter[cache[0]];

				for (int i = 1; i < toSelect; i++) {
					s *= sour[cache[i]];
					b += bitter[cache[i]];
				}

				return Math.abs(s - b);
			}
		}

		int ret = 2112345678;
		
		for(int i = startIdx; i < sour.length; i++) {
			cache[toSelect] = i;
			ret = min(ret, solve(toSelect + 1, i + 1, cache));
			ret = min(ret, solve(toSelect, i + 1, cache));			
		}
		
		return ret;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n = Integer.parseInt(reader.readLine());

		sour = new int[n];
		bitter = new int[n];
		isUsed = new boolean[n];

		for (int i = 0; i < n; i++) {
			str = reader.readLine();

			sour[i] = Integer.parseInt(str.split(" ")[0]);
			bitter[i] = Integer.parseInt(str.split(" ")[1]);
			isUsed[i] = false;
		}

		System.out.println(solve(0, 0, new int[n]));
	}
}
