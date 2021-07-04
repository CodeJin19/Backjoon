import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static int list[];
	static int cache[][][];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		int num;

		for (int itr = 0; itr < T; itr++) {
			num = Integer.parseInt(reader.readLine());
			StringTokenizer st = new StringTokenizer(reader.readLine());
			list = new int[num];
			cache = new int[num][num][2];

			for (int i = 0; i < num; i++)
				list[i] = Integer.parseInt(st.nextToken());

			if (num == 1) {
				System.out.println(list[0]);
			} else {
				playGame(true, 0, num - 1);
				System.out.println(cache[0][num - 1][0]);
			}
		}
	}

	public static void playGame(boolean isK, int l, int r) {
		if (r - l == 1) {
			if (isK) {
				if (list[l] < list[r]) {
					cache[l][r][0] = list[r];
					cache[l][r][1] = list[l];
				} else {
					cache[l][r][0] = list[l];
					cache[l][r][1] = list[r];
				}
			} else {
				if (list[l] < list[r]) {
					cache[l][r][0] = list[l];
					cache[l][r][1] = list[r];
				} else {
					cache[l][r][0] = list[r];
					cache[l][r][1] = list[l];
				}
			}

			return;
		}

		if (cache[l + 1][r][0] == 0)
			playGame(!isK, l + 1, r);

		if (cache[l][r - 1][0] == 0)
			playGame(!isK, l, r - 1);

		if (isK) {
			if (cache[l][r - 1][0] + list[r] < cache[l + 1][r][0] + list[l]) {
				cache[l][r][0] = cache[l + 1][r][0] + list[l];
				cache[l][r][1] = cache[l + 1][r][1];
			} else {
				cache[l][r][0] = cache[l][r - 1][0] + list[r];
				cache[l][r][1] = cache[l][r - 1][1];
			}
		} else {
			if (cache[l][r - 1][1] + list[r] < cache[l + 1][r][1] + list[l]) {
				cache[l][r][0] = cache[l + 1][r][0];
				cache[l][r][1] = cache[l + 1][r][1] + list[l];
			} else {
				cache[l][r][0] = cache[l][r - 1][0];
				cache[l][r][1] = cache[l][r - 1][1] + list[r];
			}
		}
	}
}
