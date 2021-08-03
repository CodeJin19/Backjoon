import java.io.*;
import java.util.*;

public class Main {
	static int choosen[];
	static boolean comb[][];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int num = Integer.parseInt(st.nextToken());

		comb = new boolean[n + 1][n + 1];

		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(reader.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			comb[y][x] = true;
			comb[x][y] = true;
		}

		choosen = new int[3];

		System.out.println(getComb(n, 1, 0));
	}

	static int getComb(int n, int start, int idx) {
		if (idx == 3)
			return 1;

		int ret = 0;

		for (int i = start; i <= n; i++) {
			boolean flag = true;

			for (int j = 0; j < idx; j++) {
				if (comb[choosen[j]][i]) {
					flag = false;
					break;
				}
			}

			if (flag) {
				choosen[idx] = i;
				ret += getComb(n, i + 1, idx + 1);
			}
		}

		return ret;
	}
}
