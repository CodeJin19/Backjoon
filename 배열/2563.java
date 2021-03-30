import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int T = Integer.parseInt(reader.readLine());
		int fld[][] = new int[110][110];
		int x, y, sum = 0;

		for (int i = 0; i < 110; i++)
			for (int j = 0; j < 110; j++)
				fld[i][j] = 0;

		for (int itr = 0; itr < T; itr++) {
			str = reader.readLine();
			x = Integer.parseInt(str.split(" ")[0]);
			y = Integer.parseInt(str.split(" ")[1]);

			for (int i = 0; i < 10; i++)
				for (int j = 0; j < 10; j++)
					fld[y + i][x + j] = 1;
		}

		for (int i = 0; i < 110; i++)
			for (int j = 0; j < 110; j++)
				sum += fld[i][j];

		System.out.println(sum);
	}
}
