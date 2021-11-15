import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		Stack<int[]> stck = new Stack<>();
		int totalScore = 0;

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());

			int flag = Integer.parseInt(st.nextToken());

			if (flag == 0) {
				if (!stck.isEmpty()) {
					int[] tmp = stck.pop();
					tmp[1]--;

					if (tmp[1] == 0) {
						totalScore += tmp[0];
					} else {
						stck.push(tmp);
					}
				}
			} else {
				int score = Integer.parseInt(st.nextToken());
				int timeLeft = Integer.parseInt(st.nextToken()) - 1;

				if (timeLeft == 0) {
					totalScore += score;
				} else {
					int[] tmp = { score, timeLeft };
					stck.push(tmp);
				}
			}
		}

		System.out.println(totalScore);
	}
}
