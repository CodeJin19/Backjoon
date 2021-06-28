import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();

		while (!check(str)) {
			Stack<Integer> stck = new Stack<Integer>();
			int len = str.length();
			boolean flag = true;

			for (int i = 0; i < len; i++) {
				switch (str.charAt(i)) {
				case '(':
					stck.push(1);
					break;
				case ')':
					if (!stck.isEmpty() && stck.peek() == 1) {
						stck.pop();
					} else {
						flag = false;
						i = len;
					}
					break;
				case '[':
					stck.push(2);
					break;
				case ']':
					if (!stck.isEmpty() && stck.peek() == 2) {
						stck.pop();
					} else {
						flag = false;
						i = len;
					}
					break;
				default:
					break;
				}
			}

			if (!stck.isEmpty())
				flag = false;

			if (flag)
				System.out.println("yes");
			else
				System.out.println("no");

			str = reader.readLine();
		}
	}

	static boolean check(String str) {
		int len = str.length();

		if (len == 1 && str.charAt(0) == '.')
			return true;
		else
			return false;
	}
}
