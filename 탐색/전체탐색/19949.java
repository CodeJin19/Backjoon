import java.io.*;
import java.util.*;

public class Main {
	static int[] answer;
	static int cnt;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		answer = new int[10];
		cnt = 0;

		for (int i = 0; i < 10; i++)
			answer[i] = Integer.parseInt(st.nextToken());

		for (int i = 1; i < 6; i++) {
			int[] cache = new int[10];
			cache[0] = i;

			set(cache, 1, i, 1);
		}

		System.out.println(cnt);
	}

	static void set(int[] cache, int idx, int num, int consCnt) {
		if (idx == 10) {
			int score = 0;

			for (int i = 0; i < 10; i++)
				if (cache[i] == answer[i])
					score++;

			if (5 <= score)
				cnt++;

			return;
		}

		for (int i = 1; i < 6; i++) {
			if (i == num) {
				if (consCnt < 2) {
					cache[idx] = i;
					set(cache, idx + 1, i, consCnt + 1);
				}
			} else {
				cache[idx] = i;
				set(cache, idx + 1, i, 1);
			}
		}
	}
}
