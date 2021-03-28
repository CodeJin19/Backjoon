import java.io.*;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n = Integer.parseInt(reader.readLine());
		int val[] = new int[n];
		double num1, num2;
		str = reader.readLine();
		Stack<Double> stck = new Stack<Double>();

		for (int i = 0; i < n; i++)
			val[i] = Integer.parseInt(reader.readLine());

		for (int i = 0; i < str.length(); i++) {
			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
				stck.push((double) val[(int) (str.charAt(i) - 'A')]);
			} else {
				num2 = stck.pop();
				num1 = stck.pop();

				switch (str.charAt(i)) {
				case '+':
					num1 = num1 + num2;
					break;
				case '-':
					num1 = num1 - num2;
					break;
				case '*':
					num1 = num1 * num2;
					break;
				case '/':
					num1 = num1 / num2;
					break;
				}

				stck.push(num1);
			}
		}

		System.out.printf("%.2f", stck.peek());
	}
}
