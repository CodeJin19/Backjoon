import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		ArrayList<Integer>[] list = new ArrayList[N + 1];

		for (int i = 1; i < N + 1; i++)
			list[i] = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int coordinate = Integer.parseInt(st.nextToken());
			int color = Integer.parseInt(st.nextToken());

			list[color].add(coordinate);
		}

		for (int i = 1; i < N + 1; i++)
			Collections.sort(list[i]);

		int sum = 0;

		for (int i = 1; i < N + 1; i++) {
			int len = list[i].size();
			
			if(len == 0)
				continue;

			sum += (list[i].get(1) - list[i].get(0));
			sum += (list[i].get(len - 1) - list[i].get(len - 2));

			for (int j = 1; j < len - 1; j++)
				sum += Math.min(list[i].get(j) - list[i].get(j - 1), list[i].get(j + 1) - list[i].get(j));
		}

		System.out.println(sum);
	}
}
