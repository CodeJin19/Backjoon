import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();

		Stack<Character> prefix = new Stack<>();
		Stack<Character> suffix = new Stack<>();

		int len = str.length();

		for (int i = 0; i < len; i++)
			prefix.push(str.charAt(i));

		int n = Integer.parseInt(reader.readLine());

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());

			switch (st.nextToken().charAt(0)) {
			case 'L':
				if (!prefix.isEmpty())
					suffix.push(prefix.pop());
				break;
			case 'D':
				if (!suffix.isEmpty())
					prefix.push(suffix.pop());
				break;
			case 'B':
				if (!prefix.isEmpty())
					prefix.pop();
				break;
			case 'P':
				char c = st.nextToken().charAt(0);
				prefix.push(c);
				break;
			}
		}

		while (!prefix.isEmpty())
			suffix.push(prefix.pop());

		StringBuilder sb = new StringBuilder();

		while (!suffix.isEmpty())
			sb.append(suffix.pop());

		System.out.println(sb);
	}
}
