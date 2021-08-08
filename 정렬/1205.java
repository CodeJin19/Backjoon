import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int N = Integer.parseInt(st.nextToken());
		int newScore = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());

		int size;

		if (N < P)
			size = P;
		else
			size = P + 1;

		int scores[] = new int[size];

		if (N == 0) {
			System.out.println("1");
		} else {
			st = new StringTokenizer(reader.readLine());

			for (int i = 0; i < N; i++)
				scores[i] = Integer.parseInt(st.nextToken());

			scores[N] = newScore;

			Arrays.sort(scores);

			if (N == P && scores[0] == newScore) {
				System.out.println("-1");
			} else {
				int prevScore = Integer.MAX_VALUE;
				int ranks = 0;
				int cnt = 0;

				for (int i = size - 1; 0 <= i; i--) {
					cnt++;

					if (scores[i] < prevScore) {
						ranks = cnt;
						prevScore = scores[i];
					}

					if (scores[i] == newScore) {
						System.out.println(ranks);
						break;
					}
				}
			}
		}
	}
}
