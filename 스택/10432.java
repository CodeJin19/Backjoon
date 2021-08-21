import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();

		for (int itr = 1; itr <= T; itr++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());

			int t = Integer.parseInt(st.nextToken());
			int cnt = 0;
			Stack<Integer> stck = new Stack<>();

			for (int i = 0; i < 12; i++) {
				int num = Integer.parseInt(st.nextToken());

				if (stck.isEmpty()) {
					stck.push(num);
				} else if (stck.peek() < num) {
					stck.push(num);
				} else if (num < stck.peek()) {
					while (num < stck.peek()) {
						stck.pop();
						cnt++;
					}

					if (num != 0) {
						if (stck.isEmpty())
							stck.push(num);
						else if (stck.peek() < num)
							stck.push(num);
					}
				}
			}

			sb.append(t).append(" ").append(cnt).append("\n");
		}

		System.out.print(sb);
	}
}
