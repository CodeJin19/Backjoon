import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();

		for (int itr = 0; itr < T; itr++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int num = Integer.parseInt(st.nextToken());
			int list[] = new int[num];

			for (int i = 0; i < num; i++)
				list[i] = Integer.parseInt(st.nextToken());

			Arrays.sort(list);
			int gap = 0;

			for (int i = 1; i < num; i++)
				gap = Math.max(gap, list[i] - list[i - 1]);

			sb.append("Class ").append((itr + 1)).append("\n");
			sb.append("Max ").append(list[num - 1]).append(", Min ").append(list[0]).append(", Largest gap ")
					.append(gap).append("\n");
		}

		System.out.print(sb);
	}
}
