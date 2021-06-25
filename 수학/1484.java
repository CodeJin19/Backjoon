import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int limit = (int) (Math.sqrt(n));
		boolean flag = true;

		for (int i = limit; 0 < i; i--) {
			if (n % i == 0) {
				int a = i;
				int b = n / a;

				if (a != b && ((a + b) % 2 == 0)) {
					System.out.println((a + b) / 2);
					flag = false;
				}
			}
		}

		if (flag)
			System.out.println("-1");
	}
}
