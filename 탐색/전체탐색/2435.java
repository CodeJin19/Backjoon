import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int list[] = new int[N];

		st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < N; i++)
			list[i] = Integer.parseInt(st.nextToken());

		int sum = 0;

		for (int i = 0; i < K; i++)
			sum += list[i];

		int max = sum;

		for (int i = K; i < N; i++) {
			sum -= list[i - K];
			sum += list[i];

			max = Math.max(max, sum);
		}

		System.out.println(max);
	}
}
