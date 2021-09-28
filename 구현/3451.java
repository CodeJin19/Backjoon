import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		HashMap<String, Integer> list = new HashMap<>();
		int listCnt = 0;
		int[][] statistic = new int[62][9];
		int[][] solved = new int[62][9];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int time = Integer.parseInt(st.nextToken());
			String team = st.nextToken();
			String problem = st.nextToken();
			String result = st.nextToken();
			int teamIdx = -1;
			int problemIdx = (int) (problem.charAt(0) - 'A');

			if (!list.containsKey(team)) {
				list.put(team, listCnt);
				teamIdx = listCnt++;
			} else {
				teamIdx = list.get(team);
			}

			if (0 < solved[teamIdx][problemIdx])
				continue;

			statistic[teamIdx][problemIdx]++;

			if ("A".compareTo(result) == 0)
				solved[teamIdx][problemIdx] = time;
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 9; i++) {
			int cnt = 0;
			int cntTotal = 0;
			int timeTotal = 0;

			for (int j = 0; j < listCnt; j++) {
				if (0 < solved[j][i]) {
					cnt++;
					cntTotal += statistic[j][i];
					timeTotal += solved[j][i];
				}
			}

			sb.append((char) ('A' + i)).append(" ").append(cnt);

			if (0 < cnt) {
				double tryAvg = cntTotal;
				tryAvg /= cnt;

				double timeAvg = timeTotal;
				timeAvg /= cnt;

				sb.append(" ").append(String.format("%.2f", tryAvg)).append(" ").append(String.format("%.2f", timeAvg));
			}

			sb.append("\n");
		}

		System.out.print(sb);
	}
}
