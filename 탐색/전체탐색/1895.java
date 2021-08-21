import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int fld[][] = new int[r][c];

		for (int i = 0; i < r; i++) {
			st = new StringTokenizer(reader.readLine());

			for (int j = 0; j < c; j++)
				fld[i][j] = Integer.parseInt(st.nextToken());
		}

		int T = Integer.parseInt(reader.readLine());
		int cnt = 0;

		for (int y = 1; y < r - 1; y++) {
			for (int x = 1; x < c - 1; x++) {
				int list[] = new int[9];
				int idx = 0;

				for (int i = y - 1; i <= y + 1; i++)
					for (int j = x - 1; j <= x + 1; j++)
						list[idx++] = fld[i][j];

				Arrays.sort(list);

				if (T <= list[4])
					cnt++;
			}
		}

		System.out.println(cnt);
	}
}
