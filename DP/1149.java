import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(reader.readLine());
		int list[][] = new int[n][3];
		int total[][] = new int[n][3];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());

			for (int j = 0; j < 3; j++)
				list[i][j] = Integer.parseInt(st.nextToken());
		}

		for (int j = 0; j < 3; j++)
			total[0][j] = list[0][j];

		for (int i = 1; i < n; i++) {
			total[i][0] = list[i][0] + Math.min(total[i - 1][1], total[i - 1][2]);
			total[i][1] = list[i][1] + Math.min(total[i - 1][0], total[i - 1][2]);
			total[i][2] = list[i][2] + Math.min(total[i - 1][0], total[i - 1][1]);
		}

		System.out.println(Math.min(total[n - 1][0], Math.min(total[n - 1][1], total[n - 1][2])));
	}
}
