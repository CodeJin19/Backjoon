import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static int list[][];

	static int getScore(int order[]) {
		int outCnt, hit;
		int idx = 0;
		int score = 0;
		boolean isAt[];

		for (int i = 0; i < list.length; i++) {
			outCnt = 0;
			isAt = new boolean[4];

			while (outCnt != 3) {
				hit = list[i][order[idx]];

				if (hit == 0) {
					outCnt++;
				} else {
					for (int j = 3; 0 < j; j--) {
						if (isAt[j]) {
							isAt[j] = false;
							
							if (4 <= j + hit)
								score++;
							else
								isAt[j + hit] = true;
						}
					}

					if (4 <= hit) {
						score++;
					} else {
						isAt[hit] = true;
					}
				}

				idx = (idx + 1) % 9;
			}
		}

		return score;
	}

	static int getFact(int idx, int order[], boolean cache[]) {
		if (idx == 9) {
			int score = getScore(order);
			return score;
		}

		int ret = 0;

		if (idx == 3) {
			order[idx] = 1;
			ret = Math.max(ret, getFact(idx + 1, order, cache));
		} else {
			for (int i = 0; i < 9; i++) {
				if (!cache[i]) {
					order[idx] = i + 1;
					cache[i] = true;
					ret = Math.max(ret, getFact(idx + 1, order, cache));
					cache[i] = false;
				}
			}
		}

		return ret;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(reader.readLine());
		boolean tmp[] = new boolean[9];

		list = new int[T][10];

		for (int itr = 0; itr < T; itr++) {
			st = new StringTokenizer(reader.readLine());

			for (int i = 1; i <= 9; i++)
				list[itr][i] = Integer.parseInt(st.nextToken());
		}

		tmp[0] = true;

		System.out.println(getFact(0, new int[9], tmp));
	}
}
