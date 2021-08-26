import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();

		for (int itr = 1; itr <= T; itr++) {
			int fld[][] = new int[9][9];
			StringTokenizer st;

			if (1 < itr)
				st = new StringTokenizer(reader.readLine());

			for (int i = 0; i < 9; i++) {
				st = new StringTokenizer(reader.readLine());

				for (int j = 0; j < 9; j++)
					fld[i][j] = Integer.parseInt(st.nextToken());
			}

			boolean flag = true;

			for (int i = 0; i < 9; i++) {
				boolean isUsed[] = new boolean[9];

				for (int j = 0; j < 9; j++)
					isUsed[fld[i][j] - 1] = true;

				int cnt = 0;

				for (int j = 0; j < 9; j++)
					if (isUsed[j])
						cnt++;

				if (cnt != 9) {
					flag = false;
					i = 10;
				}
			}

			if (flag) {
				for (int i = 0; i < 9; i++) {
					boolean isUsed[] = new boolean[9];

					for (int j = 0; j < 9; j++)
						isUsed[fld[j][i] - 1] = true;

					int cnt = 0;

					for (int j = 0; j < 9; j++)
						if (isUsed[j])
							cnt++;

					if (cnt != 9) {
						flag = false;
						i = 10;
					}
				}
			}

			if (flag) {
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						boolean isUsed[] = new boolean[9];

						for (int k = i * 3; k < i * 3 + 3; k++)
							for (int l = j * 3; l < j * 3 + 3; l++)
								isUsed[fld[k][l] - 1] = true;

						int cnt = 0;

						for (int k = 0; k < 9; k++)
							if (isUsed[k])
								cnt++;

						if (cnt != 9) {
							flag = false;
							j = 3;
							i = 3;
						}
					}
				}
			}

			sb.append("Case ").append(itr);

			if (flag)
				sb.append(": CORRECT\n");
			else
				sb.append(": INCORRECT\n");
		}

		System.out.print(sb);
	}
}
