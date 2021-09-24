import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();

		for (int itr = 0; itr < T; itr++) {
			int N = Integer.parseInt(reader.readLine());
			HashMap<Integer, Integer> list1 = new HashMap<>();
			StringTokenizer st = new StringTokenizer(reader.readLine());

			for (int i = 0; i < N; i++)
				list1.put(Integer.parseInt(st.nextToken()), 1);

			int M = Integer.parseInt(reader.readLine());
			st = new StringTokenizer(reader.readLine());

			for (int i = 0; i < M; i++)
				if (list1.containsKey(Integer.parseInt(st.nextToken())))
					sb.append(1).append("\n");
				else
					sb.append(0).append("\n");
		}

		System.out.println(sb);
	}
}
