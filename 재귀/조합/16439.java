import java.io.*;
import java.util.*;

public class Main {
	static int score[][];

	static int BFS(int cache[], int idx, int start) {
		if (idx == 3) {
			int sum = 0;

			for (int i = 0; i < score.length; i++) {
				int max = 0;

				for (int j = 0; j < 3; j++)
					max = Math.max(max, score[i][cache[j]]);

				sum += max;
			}

			return sum;
		}

		int ret = 0;

		for (int i = start; i < score[0].length; i++) {
			cache[idx] = i;
			ret = Math.max(ret, BFS(cache, idx + 1, i + 1));
		}

		return ret;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		score = new int[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(reader.readLine());

			for (int j = 0; j < M; j++)
				score[i][j] = Integer.parseInt(st.nextToken());
		}

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < M - 2; i++) {
			int cache[] = new int[3];
			cache[0] = i;
			max = Math.max(max, BFS(cache, 1, i + 1));
		}

		System.out.println(max);
	}
}
