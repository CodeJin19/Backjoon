import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int score[] = new int[n];
		int sum[] = new int[m];
		int num[] = new int[m];

		st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < n; i++)
			score[i] = Integer.parseInt(st.nextToken());

		int max = 0;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(reader.readLine());

			num[i] = Integer.parseInt(st.nextToken());

			int tmp = 0;

			for (int j = 0; j < n; j++)
				if (st.nextToken().charAt(0) == 'O')
					tmp += score[j];

			sum[i] = tmp;

			if (max < tmp) {
				max = tmp;
				min = num[i];
			} else if (max == tmp && num[i] < min) {
				min = num[i];
			}
		}

		System.out.println(min + " " + max);
	}
}
