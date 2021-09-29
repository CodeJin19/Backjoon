import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			int p = Integer.parseInt(st.nextToken());

			min = Math.min(min, p);
			sb.append(min).append(" ");
			min++;
		}

		System.out.println(sb);
	}
}
