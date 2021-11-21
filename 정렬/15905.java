import java.io.*;
import java.util.*;

public class Main {
	static class student implements Comparable<student> {
		public int solved;
		public int penalty;

		student(int solved, int penalty) {
			this.solved = solved;
			this.penalty = penalty;
		}

		@Override
		public int compareTo(student o) {
			if (this.solved == o.solved) {
				return this.penalty - o.penalty;
			} else {
				return o.solved - this.solved;
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		student[] list = new student[n];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());

			int solved = Integer.parseInt(st.nextToken());
			int penalty = Integer.parseInt(st.nextToken());

			list[i] = new student(solved, penalty);
		}

		Arrays.sort(list);
		int solved = list[4].solved;
		int idx = 5;
		int cnt = 0;

		while (idx < n && list[idx].solved == solved) {
			idx++;
			cnt++;
		}

		System.out.println(cnt);
	}
}
