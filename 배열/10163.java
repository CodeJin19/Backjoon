import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(str);
		int fld[][];
		int list[][] = new int[N][4];
		int x1, x2, y1, y2, sum;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(reader.readLine());

			list[i][0] = Integer.parseInt(st.nextToken());
			list[i][2] = Integer.parseInt(st.nextToken());
			list[i][1] = list[i][0] + Integer.parseInt(st.nextToken());
			list[i][3] = list[i][2] + Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < N; i++) {
			fld = new int[110][110];
			sum = 0;

			for (int y = list[i][2]; y < list[i][3]; y++)
				for (int x = list[i][0]; x < list[i][1]; x++)
					fld[y][x] = 1;

			for (int j = i + 1; j < N; j++)
				if (list[i][0] < list[j][1] && list[i][2] < list[j][3] && list[j][0] < list[i][1]
						&& list[j][2] < list[i][3])
					for (int y = list[j][2]; y < list[j][3]; y++)
						for (int x = list[j][0]; x < list[j][1]; x++)
							fld[y][x] = 0;

			for (int y = 0; y < 110; y++)
				for (int x = 0; x < 110; x++)
					sum += fld[y][x];

			sb.append(sum).append("\n");
		}

		System.out.println(sb);
	}
}
