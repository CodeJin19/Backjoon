import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());

		for (int itr = 0; itr < T; itr++) {
			String str = reader.readLine();

			StringTokenizer st = new StringTokenizer(reader.readLine());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			char fld[][] = new char[h][w];

			int cnt = 0;

			for (int i = 0; i < h; i++) {
				str = reader.readLine();

				for (int j = 0; j < w; j++)
					fld[i][j] = str.charAt(j);
			}

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (fld[i][j] == '>' && j + 2 < w) {
						if(fld[i][j + 1] == 'o' && fld[i][j + 2] == '<') {
							cnt++;
							j += 2;
						}
					} else if (fld[i][j] == 'v' && i + 2 < h) {
						if(fld[i + 1][j] == 'o' && fld[i + 2][j] == '^') {
							cnt++;
						}
					}
				}
			}

			System.out.println(cnt);
		}
	}
}
