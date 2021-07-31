import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		StringBuilder sb = new StringBuilder();
		int list[] = new int[5];

		for (int i = 0; i < 5; i++)
			list[i] = Integer.parseInt(st.nextToken());

		boolean flag = false;

		while (!flag) {
			for (int i = 1; i < 5; i++) {
				if (list[i] < list[i - 1]) {
					int tmp = list[i];
					list[i] = list[i - 1];
					list[i - 1] = tmp;

					sb.append(list[0]);
					for (int j = 1; j < 5; j++)
						sb.append(" ").append(list[j]);
					sb.append("\n");
				}
			}

			flag = true;

			for (int i = 1; i < 5; i++)
				if (list[i] < list[i - 1])
					flag = false;
		}

		System.out.println(sb);
	}
}
