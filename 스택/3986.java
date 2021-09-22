import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Stack<Character> stck;
		int ans = 0;

		for (int i = 0; i < n; i++) {
			String str = reader.readLine();
			stck = new Stack<>();

			for (int j = 0; j < str.length(); j++) {
				if (stck.isEmpty())
					stck.push(str.charAt(j));
				else if (stck.peek() == str.charAt(j))
					stck.pop();
				else
					stck.push(str.charAt(j));
			}

			if (stck.isEmpty())
				ans++;
		}

		System.out.println(ans);
	}
}
