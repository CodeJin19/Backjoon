import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());

		StringBuilder sb = new StringBuilder();

		for (int itr = 0; itr < T; itr++) {
			String str = reader.readLine();
			int len = str.length();

			Stack<Character> prefix = new Stack<>();
			Stack<Character> suffix = new Stack<>();

			for (int i = 0; i < len; i++) {
				if (str.charAt(i) == '<') {
					if (!prefix.isEmpty())
						suffix.push(prefix.pop());
				} else if (str.charAt(i) == '>') {
					if (!suffix.isEmpty())
						prefix.push(suffix.pop());
				} else if (str.charAt(i) == '-') {
					if (!prefix.isEmpty())
						prefix.pop();
				} else {
					prefix.push(str.charAt(i));
				}
			}

			while (!prefix.isEmpty())
				suffix.push(prefix.pop());

			while (!suffix.isEmpty())
				sb.append(suffix.pop());

			sb.append("\n");
		}

		System.out.print(sb);
	}
}
