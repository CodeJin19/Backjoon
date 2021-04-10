import java.io.*;
import java.util.*;

public class Main {
	static int sin[][];
	static int min = Integer.MAX_VALUE;

	public static void getComb(int toSelect, int startIdx, boolean cache[]) {
		if (toSelect == sin.length / 2) {
			int sum1 = 0;
			int sum2 = 0;

			for (int i = 0; i < sin.length; i++)
				for (int j = 0; j < sin.length; j++)
					if (cache[i] && cache[j])
						sum1 += sin[i][j];

			for (int i = 0; i < sin.length; i++)
				for (int j = 0; j < sin.length; j++)
					if (!cache[i] && !cache[j])
						sum2 += sin[i][j];

			min = Math.min(min, Math.abs(sum1 - sum2));
			return;
		}

		for (int i = startIdx; i < sin.length; i++) {
			cache[i] = true;
			getComb(toSelect + 1, i + 1, cache);
			cache[i] = false;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(reader.readLine());
		sin = new int[n][n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());

			for (int j = 0; j < n; j++)
				sin[i][j] = Integer.parseInt(st.nextToken());
		}

		getComb(0, 0, new boolean[n]);

		System.out.println(min);
	}
}
