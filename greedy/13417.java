import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());

		StringBuilder sb = new StringBuilder();

		for (int itr = 0; itr < T; itr++) {
			int n = Integer.parseInt(reader.readLine());
			StringTokenizer st = new StringTokenizer(reader.readLine());
			Deque<Character> str = new LinkedList<>();

			char c = st.nextToken().charAt(0);
			char header = c;
			str.offerLast(c);

			for (int i = 1; i < n; i++) {
				c = st.nextToken().charAt(0);

				if (c <= header) {
					str.offerFirst(c);
					header = c;
				} else {
					str.offerLast(c);
				}
			}

			StringBuilder tmp = new StringBuilder();

			for (int i = 0; i < n; i++)
				tmp.append(str.pollFirst());

			sb.append(tmp).append("\n");
		}

		System.out.print(sb);
	}
}
