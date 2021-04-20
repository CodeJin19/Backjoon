import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		double max, sum = 0;
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		double scoreList[][] = new double[m + 1][n];
		int personList[][] = new int[m + 1][n];
		int idxList[] = new int[m + 1];
		boolean cache[] = new boolean[n];
		int idx;

		for (int i = 1; i <= m; i++) {
			idxList[i] = 0;
			st = new StringTokenizer(reader.readLine());

			for (int j = 0; j < n; j++) {
				personList[i][j] = Integer.parseInt(st.nextToken());
				scoreList[i][j] = Double.parseDouble(st.nextToken());
			}
		}

		for (int i = 0; i < k; i++) {
			max = -1;
			idx = 0;

			for (int j = 1; j <= m; j++) {
				while(cache[personList[j][idxList[j]] - 1]) {
					idxList[j]++;
				}
				
				if (idxList[j] < n && max < scoreList[j][idxList[j]]) {
					max = scoreList[j][idxList[j]];
					idx = j;
				}
			}

			sum += scoreList[idx][idxList[idx]];
			cache[personList[idx][idxList[idx]] - 1] = true;
			idxList[idx] += 1;
		}

		System.out.printf("%.1f", sum);
	}
}
