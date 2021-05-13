import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int list[][];
		int cnt[];
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(reader.readLine());
		int from, to, amount, min, answer = 0;

		list = new int[m][3];
		cnt = new int[n + 1];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(reader.readLine());

			for (int j = 0; j < 3; j++) {
				list[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		Arrays.sort(list, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] < o2[1]) {
					return -1;
				} else if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				} else {
					return 1;
				}
			}
		});

		for (int i = 0; i < m; i++) {
			from = list[i][0];
			to = list[i][1];
			amount = list[i][2];
			min = Integer.MAX_VALUE;

			for (int j = from; j < to; j++)
				min = Math.min(min, c - cnt[j]);

			if (min < amount)
				amount = min;

			for (int j = from; j < to; j++)
				cnt[j] += amount;
			
			answer += amount;
		}
		
		System.out.println(answer);
	}
}
