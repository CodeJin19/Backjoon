import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int len = str.length();
		int state = 0;
		int cnt = 0;
		int sum = 0;

		for (int i = 0; i < len; i++) {
			if (state == 0 && str.charAt(i) == ':') {
				state = 1;
			} else if (state == 1 && str.charAt(i) == '-') {
				state = 2;
			} else if (state == 2 && str.charAt(i) == ')') {
				cnt++;
				sum++;
				state = 0;
			} else if (state == 2 && str.charAt(i) == '(') {
				cnt++;
				sum--;
				state = 0;
			} else {
				state = 0;
			}
		}

		if (cnt == 0)
			System.out.println("none");
		else if (sum == 0)
			System.out.println("unsure");
		else if (0 < sum)
			System.out.println("happy");
		else if (sum < 0)
			System.out.println("sad");
	}
}
