import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(reader.readLine());
		int u = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());

		char fld[][] = new char[u + h + d][l + w + r];
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < h; i++) {
			String str = reader.readLine();

			for (int j = 0; j < w; j++) {
				fld[u + i][l + j] = str.charAt(j);
			}
		}

		for (int i = 0; i < u + h + d; i++) {
			for (int j = 0; j < l + w + r; j++) {
				if (i < u || u + h <= i || j < l || l + w <= j) {
					if (i % 2 == 0) {
						if (j % 2 == 0)
							fld[i][j] = '#';
						else
							fld[i][j] = '.';
					} else {
						if (j % 2 == 0)
							fld[i][j] = '.';
						else
							fld[i][j] = '#';
					}
				}

				sb.append(fld[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
}
