import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int score[][];
		int cache[][];
		int T = Integer.parseInt(reader.readLine());
		int n;

		for (int itr = 0; itr < T; itr++) {
			n = Integer.parseInt(reader.readLine());

			score = new int[2][n];
			cache = new int[3][n];

			for (int i = 0; i < 2; i++) {
				st = new StringTokenizer(reader.readLine());

				for (int j = 0; j < n; j++)
					score[i][j] = Integer.parseInt(st.nextToken());
			}
			
			cache[0][0] = score[0][0];
			cache[1][0] = score[1][0];
			cache[2][0] = 0;
			
			for(int i = 1; i < n; i++) {
				cache[0][i] = score[0][i] + Math.max(cache[1][i - 1],  cache[2][i - 1]);
				cache[1][i] = score[1][i] + Math.max(cache[0][i - 1],  cache[2][i - 1]);
				cache[2][i] = Math.max(Math.max(cache[0][i - 1], cache[1][i - 1]), cache[2][i - 1]);
			}

			System.out.println(Math.max(Math.max(cache[0][n - 1], cache[1][n - 1]), cache[2][n - 1]));
		}
	}
}
