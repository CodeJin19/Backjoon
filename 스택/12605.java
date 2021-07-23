import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());

		for (int itr = 0; itr < N; itr++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			Stack<String> stck = new Stack<String>();

			while (st.hasMoreTokens())
				stck.push(st.nextToken());

			StringBuilder sb = new StringBuilder();
			sb.append("Case #").append((itr + 1)).append(":");

			while (!stck.isEmpty())
				sb.append(" ").append(stck.pop());

			System.out.println(sb);
		}
	}
}
