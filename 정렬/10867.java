import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		StringTokenizer st = new StringTokenizer(reader.readLine());
		StringBuilder sb = new StringBuilder();
		int list[] = new int[n];

		for (int i = 0; i < n; i++)
			list[i] = Integer.parseInt(st.nextToken());

		Arrays.sort(list);

		sb.append(list[0]);
		int tmp = list[0];

		for (int i = 1; i < n; i++) {
			if (tmp != list[i]) {
				tmp = list[i];
				sb.append(" ").append(tmp);
			}
		}

		System.out.println(sb);
	}
}
