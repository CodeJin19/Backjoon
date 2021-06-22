import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		if (n == 1) {
			System.out.println(4);
		} else if (n == 2) {
			System.out.println(6);
		} else {
			long a = 1;
			long b = 1;
			long c = 1;
			long ans;
			int cnt = 3;

			while (cnt <= n) {
				c = a + b;
				a = b;
				b = c;
				cnt++;
			}

			ans = 2 * (2 * b + a);
			System.out.println(ans);
		}
	}
}
