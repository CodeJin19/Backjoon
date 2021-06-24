import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int total[][] = new int[4][3];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());

			for (int j = 0; j < 3; j++) {
				int score = Integer.parseInt(st.nextToken());
				total[score][j]++;
			}
		}

		int max = Integer.MIN_VALUE;

		for (int j = 0; j < 3; j++) {
			for (int i = 1; i < 4; i++)
				total[0][j] += total[i][j] * i;

			max = Math.max(max, total[0][j]);
		}

		int cnt = 0;

		for (int i = 0; i < 3; i++)
			if (total[0][i] == max)
				cnt++;

		if (cnt == 1) {
			for (int i = 0; i < 3; i++)
				if (total[0][i] == max)
					System.out.println((i + 1) + " " + total[0][i]);
		} else if (cnt == 2) {
			int x = -1;
			int y = -1;

			for (int i = 0; i < 3; i++) {
				if (total[0][i] == max) {
					if (x == -1)
						x = i;
					else
						y = i;
				}
			}

			boolean flag = true;

			for (int i = 3; 0 < i; i--) {
				if (total[i][x] < total[i][y]) {
					System.out.println((y + 1) + " " + total[0][y]);
					flag = false;
					break;
				} else if (total[i][y] < total[i][x]) {
					System.out.println((x + 1) + " " + total[0][x]);
					flag = false;
					break;
				}
			}

			if (flag)
				System.out.println("0 " + total[0][y]);
		} else if (cnt == 3) {
			boolean flag = true;

			for (int i = 3; 0 < i; i--) {
				if (total[i][0] < total[i][1]) {
					if (total[i][1] < total[i][2]) {
						System.out.println(3 + " " + total[0][2]);
						flag = false;
						break;
					} else if (total[i][2] < total[i][1]) {
						System.out.println(2 + " " + total[0][1]);
						flag = false;
						break;
					}
				} else {
					if (total[i][0] < total[i][2]) {
						System.out.println(3 + " " + total[0][2]);
						flag = false;
						break;
					} else if (total[i][2] < total[i][0]) {
						System.out.println(1 + " " + total[0][1]);
						flag = false;
						break;
					}
				}
			}

			if (flag)
				System.out.println("0 " + total[0][0]);
		}
	}
}
