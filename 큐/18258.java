import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		StringTokenizer st;

		Deque<Integer> deque = new LinkedList<>();
		int num;
		StringBuilder sb = new StringBuilder();

		for (int itr = 0; itr < n; itr++) {
			st = new StringTokenizer(reader.readLine());
			String str = st.nextToken();

			switch (str.charAt(1)) {
			case 'u':
				num = Integer.parseInt(st.nextToken());
				deque.offerLast(num);
				break;
			case 'o':
				if (deque.isEmpty())
					sb.append(-1);
				else
					sb.append(deque.pollFirst());
				sb.append("\n");
				break;
			case 'i':
				sb.append(deque.size());
				sb.append("\n");
				break;
			case 'm':
				if (deque.isEmpty())
					sb.append(1);
				else
					sb.append(0);
				sb.append("\n");
				break;
			case 'r':
				if (deque.isEmpty())
					sb.append(-1);
				else
					sb.append(deque.peekFirst());
				sb.append("\n");
				break;
			case 'a':
				if (deque.isEmpty())
					sb.append(-1);
				else
					sb.append(deque.peekLast());
				sb.append("\n");
				break;
			}

		}

		System.out.print(sb);
	}
}
