import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int a = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();

		while (a != 0 || c != 00) {
			st = new StringTokenizer(reader.readLine());

			int num = Integer.parseInt(st.nextToken());
			int cnt = a - num;
			int max = num;

			for (int i = 1; i < c; i++) {
				num = Integer.parseInt(st.nextToken());

				if (num < max)
					cnt += (max - num);
				max = num;
			}

			sb.append(cnt).append("\n");

			st = new StringTokenizer(reader.readLine());

			a = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
		}

		System.out.println(sb);
	}
}
