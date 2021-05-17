import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int adjArr[][];
		int dist[][];
		int items[];
		int from, to, cost, ans, cnt;

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());

		adjArr = new int[n + 1][n + 1];
		dist = new int[n + 1][n + 1];
		items = new int[n + 1];

		st = new StringTokenizer(reader.readLine());

		for (int i = 1; i <= n; i++) {
			items[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < r; i++) {
			st = new StringTokenizer(reader.readLine());

			from = Integer.parseInt(st.nextToken());
			to = Integer.parseInt(st.nextToken());
			cost = Integer.parseInt(st.nextToken());

			adjArr[from][to] = cost;
			adjArr[to][from] = cost;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j)
					dist[i][j] = 0;
				else if (adjArr[i][j] != 0)
					dist[i][j] = adjArr[i][j];
				else
					dist[i][j] = Integer.MAX_VALUE;
			}
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					if (dist[j][i] + dist[i][k] < 0) {
						dist[j][k] = Math.min(dist[j][k], Integer.MAX_VALUE);
					} else {
						dist[j][k] = Math.min(dist[j][k], dist[j][i] + dist[i][k]);
					}
				}
			}
		}

		ans = 0;

		for (int i = 1; i <= n; i++) {
			cnt = 0;

			for (int j = 1; j <= n; j++) {
				if (dist[i][j] <= m) {
					cnt += items[j];
				}
			}

			ans = Math.max(ans, cnt);
		}

		System.out.println(ans);
	}
}
