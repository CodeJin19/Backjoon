import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		int list[][] = new int[N][2];

		StringTokenizer st;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(reader.readLine());
			list[i][0] = Integer.parseInt(st.nextToken());
			list[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(list, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});

		int time = 0;

		for (int i = 0; i < N; i++) {
			if (time <= list[i][0]) {
				time = list[i][0] + list[i][1];
			} else {
				time += list[i][1];
			}
		}

		System.out.println(time);
	}
}
