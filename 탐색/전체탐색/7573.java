import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int fish[][] = new int[m][2];
		ArrayList<Integer> xList = new ArrayList<Integer>();
		ArrayList<Integer> yList = new ArrayList<Integer>();

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(reader.readLine());
			fish[i][0] = Integer.parseInt(st.nextToken());
			fish[i][1] = Integer.parseInt(st.nextToken());

			yList.add(fish[i][0]);
			xList.add(fish[i][1]);
		}

		int max = Integer.MIN_VALUE;

		for (int yIdx = 0; yIdx < yList.size(); yIdx++) {
			for (int xIdx = 0; xIdx < xList.size(); xIdx++) {
				int xFrom = xList.get(xIdx);
				int yFrom = yList.get(yIdx);

				int xTo = xFrom + (l - 2) / 2;
				int yTo = yFrom + 1;

				while (1 <= (xTo - xFrom)) {
					int cnt = 0;

					for (int i = 0; i < m; i++) {
						if (yFrom <= fish[i][0] && fish[i][0] <= yTo && xFrom <= fish[i][1] && fish[i][1] <= xTo) {
							cnt++;
						}
					}

					max = Math.max(max, cnt);

					xTo--;
					yTo++;
				}
			}
		}

		System.out.println(max);
	}
}
