import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int zr = Integer.parseInt(st.nextToken());
		int zc = Integer.parseInt(st.nextToken());

		char fld[][] = new char[r][c];
		char newFld[][] = new char[r][zc * c];

		for (int i = 0; i < r; i++) {
			String str = reader.readLine();

			for (int j = 0; j < c; j++) {
				fld[i][j] = str.charAt(j);
			}
		}

		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				for (int k = 0; k < zc; k++)
					newFld[i][j * zc + k] = fld[i][j];

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < zr; j++) {
				for (int k = 0; k < zc * c; k++) {
					sb.append(newFld[i][k]);
				}
				sb.append("\n");
			}
		}

		System.out.println(sb);
	}
}
