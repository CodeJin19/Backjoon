import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int ys = -1;
		int xs = -1;
		int ye = -1;
		int xe = -1;
		char fld[][] = new char[n][m];

		for (int i = 0; i < n; i++) {
			String str = reader.readLine();

			for (int j = 0; j < m; j++) {
				fld[i][j] = str.charAt(j);

				if (ys == -1 && fld[i][j] == '#') {
					ys = i;
					xs = j;
				}

				if (fld[i][j] == '#') {
					ye = i;
					xe = j;
				}
			}
		}

		int len = (ye - ys) / 2;

		if (fld[ys][xs + len] == '.') {
			System.out.println("UP");
		} else if (fld[ye][xs + len] == '.') {
			System.out.println("DOWN");
		} else if (fld[ys + len][xs] == '.') {
			System.out.println("LEFT");
		} else if (fld[ys + len][xe] == '.') {
			System.out.println("RIGHT");
		}
	}
}
