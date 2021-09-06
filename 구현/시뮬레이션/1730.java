import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		String str = reader.readLine();
		int y = 0;
		int x = 0;

		int fld[][] = new int[n][n];
		int len = str.length();

		for (int i = 0; i < len; i++) {
			switch (str.charAt(i)) {
			case 'U':
				if (0 < y) {
					fld[y][x] |= 1;
					y--;
					fld[y][x] |= 1;
				}
				break;
			case 'D':
				if (y < n - 1) {
					fld[y][x] |= 2;
					y++;
					fld[y][x] |= 2;
				}
				break;
			case 'L':
				if (0 < x) {
					fld[y][x] |= 4;
					x--;
					fld[y][x] |= 4;
				}
				break;
			case 'R':
				if (x < n - 1) {
					fld[y][x] |= 8;
					x++;
					fld[y][x] |= 8;
				}

				break;
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				switch (fld[i][j]) {
				case 0:
					sb.append(".");
					break;
				case 1:
				case 2:
				case 3:
					sb.append("|");
					break;
				case 4:
				case 8:
				case 12:
					sb.append("-");
					break;
				default:
					sb.append("+");
					break;
				}
			}
			sb.append("\n");
		}

		System.out.print(sb);
	}
}
