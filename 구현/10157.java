import java.io.*;
import java.util.*;

public class Main {
	static int ans;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int c = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());

		int[][] fld = new int[r][c];

		int k = Integer.parseInt(reader.readLine());

		if (r * c < k) {
			System.out.println(0);
		} else if (k == 1) {
			System.out.println("1 1");
		} else {
			int y = 0;
			int x = 0;
			int val = 1;
			int d = 0;

			while (val != k) {
				fld[y][x] = val++;

				switch (d) {
				case 0:
					y++;
					if (y == r || 0 < fld[y][x]) {
						y--;
						x++;
						d = 1;
					}
					break;
				case 1:
					x++;
					if (x == c || 0 < fld[y][x]) {
						x--;
						y--;
						d = 2;
					}
					break;
				case 2:
					y--;
					if (y < 0 || 0 < fld[y][x]) {
						y++;
						x--;
						d = 3;
					}
					break;
				case 3:
					x--;
					if (x < 0 || 0 < fld[y][x]) {
						x++;
						y++;
						d = 0;
					}
					break;
				}
			}

			System.out.println((x + 1) + " " + (y + 1));
		}
	}
}
