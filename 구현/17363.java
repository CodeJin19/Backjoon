import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char fld[][] = new char[m][n];

		for (int i = 0; i < n; i++) {
			String str = reader.readLine();

			for (int j = 0; j < m; j++) {
				switch (str.charAt(j)) {
				case '.':
					fld[m - 1 - j][i] = '.';
					break;
				case 'O':
					fld[m - 1 - j][i] = 'O';
					break;
				case '-':
					fld[m - 1 - j][i] = '|';
					break;
				case '|':
					fld[m - 1 - j][i] = '-';
					break;
				case '/':
					fld[m - 1 - j][i] = '\\';
					break;
				case '\\':
					fld[m - 1 - j][i] = '/';
					break;
				case '^':
					fld[m - 1 - j][i] = '<';
					break;
				case '<':
					fld[m - 1 - j][i] = 'v';
					break;
				case 'v':
					fld[m - 1 - j][i] = '>';
					break;
				case '>':
					fld[m - 1 - j][i] = '^';
					break;
				}
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(fld[i][j]);
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}
}
