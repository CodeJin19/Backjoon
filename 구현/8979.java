import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int list[][] = new int[n][4];
		int g = 0;
		int s = 0;
		int b = 0;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());

			for (int j = 0; j < 4; j++)
				list[i][j] = Integer.parseInt(st.nextToken());

			if (list[i][0] == k) {
				g = list[i][1];
				s = list[i][2];
				b = list[i][3];
			}
		}

		int cnt = 0;

		for (int i = 0; i < n; i++) {
			if (g < list[i][1]) {
				cnt++;
			} else if (g == list[i][1]) {
				if (s < list[i][2]) {
					cnt++;
				} else if (s == list[i][2]) {
					if (b < list[i][3])
						cnt++;
				}
			}
		}

		System.out.println(cnt + 1);
	}
}
