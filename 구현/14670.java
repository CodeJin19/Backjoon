import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int symptoms[] = new int[101];

		for (int i = 0; i < 101; i++)
			symptoms[i] = -1;

		StringTokenizer st;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());
			int s = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			symptoms[s] = m;
		}

		int m = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(reader.readLine());

			n = Integer.parseInt(st.nextToken());
			int tmp[] = new int[n];
			boolean flag = true;

			for (int j = 0; j < n; j++) {
				int s = Integer.parseInt(st.nextToken());

				if (0 <= symptoms[s])
					tmp[j] = symptoms[s];
				else
					flag = false;
			}

			if (flag) {
				sb.append(tmp[0]);

				for (int j = 1; j < n; j++)
					sb.append(" ").append(tmp[j]);
			} else {
				sb.append("YOU DIED");
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}
}
