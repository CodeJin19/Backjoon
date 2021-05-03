import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static int score[][];
	
	public static int solve(int idx, int sum, boolean isUsed[]) {
		if(idx == 11)
			return sum;
		
		int ret = 0;
		
		for(int i = 0; i < 11; i++) {
			if(!isUsed[i] && 0 < score[idx][i]) {
				isUsed[i] = true;
				ret = Math.max(ret, solve(idx + 1, sum + score[idx][i], isUsed));
				isUsed[i] = false;
			}
		}
		
		return ret;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(reader.readLine());
		boolean isUsed[];

		for (int itr = 0; itr < T; itr++) {
			score = new int[11][11];
			isUsed = new boolean[11];

			for (int i = 0; i < 11; i++) {
				st = new StringTokenizer(reader.readLine());

				for (int j = 0; j < 11; j++)
					score[i][j] = Integer.parseInt(st.nextToken());
			}

			System.out.println(solve(0, 0, isUsed));
		}
	}
}
