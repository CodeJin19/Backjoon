import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int conn[][] = new int[n + 1][n + 1];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(reader.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			conn[x][y] = 1;
			conn[y][x] = 1;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
                    if(j == k || conn[j][i] == 0 || conn[i][k] == 0)
                        continue;
                    
					if (conn[j][k] == 0)
						conn[j][k] = conn[j][i] + conn[i][k];
					else
						conn[j][k] = Math.min(conn[j][k], conn[j][i] + conn[i][k]);
                }
            }
        }

		int min = Integer.MAX_VALUE;
		int idx = 0;

		for (int i = n; 1 <= i; i--) {
			int sum = 0;

			for (int j = 1; j <= n; j++)
				sum += conn[i][j];

			if (sum <= min) {
				min = sum;
				idx = i;
			}
		}

		System.out.println(idx);
	}
}
