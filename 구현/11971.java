import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int limit[] = new int[100];
		int speed[] = new int[100];

		StringTokenizer st = new StringTokenizer(reader.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int idx = 0;

		for (int itr = 0; itr < N; itr++) {
			st = new StringTokenizer(reader.readLine());

			int len = Integer.parseInt(st.nextToken());
			int val = Integer.parseInt(st.nextToken());

			for (int i = 0; i < len; i++)
				limit[idx++] = val;
		}

		idx = 0;

		for (int itr = 0; itr < M; itr++) {
			st = new StringTokenizer(reader.readLine());

			int len = Integer.parseInt(st.nextToken());
			int val = Integer.parseInt(st.nextToken());

			for (int i = 0; i < len; i++)
				speed[idx++] = val;
		}

		int max = 0;

		for (int i = 0; i < 100; i++)
			if (limit[i] < speed[i])
				max = Math.max(max, speed[i] - limit[i]);

		System.out.println(max);

	}
}
