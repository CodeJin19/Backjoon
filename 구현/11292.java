import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(reader.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		while (N != 0) {
			String name[] = new String[N];
			double height[] = new double[N];
			double max = 0;

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(reader.readLine());
				name[i] = st.nextToken();
				height[i] = Double.parseDouble(st.nextToken());

				max = Math.max(max, height[i]);
			}

			boolean flag = true;

			for (int i = 0; i < N; i++) {
				if (height[i] == max) {
					if (flag) {
						sb.append(name[i]);
						flag = false;
					} else {
						sb.append(" ").append(name[i]);
					}
				}
			}

			sb.append("\n");
			N = Integer.parseInt(reader.readLine());
		}

		System.out.print(sb);
	}
}
