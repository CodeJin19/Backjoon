import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(reader.readLine());
		int list[][] = new int[n][2];
		int idx, time, cnt;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());
			list[i][0] = Integer.parseInt(st.nextToken());
			list[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(list, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] < o2[1])
					return -1;
				else if (o1[1] == o2[1])
					return o1[0] - o2[0];
				else
					return 1;
			}
		});

		idx = 0;
		cnt = 0;
		time = -1;

		while (idx < n) {
			if (time <= list[idx][0]) {
				time = list[idx++][1];
				cnt++;
			} else {
				while (idx < n && list[idx][0] < time)
					idx++;
			}
		}

		System.out.println(cnt);
	}
}
