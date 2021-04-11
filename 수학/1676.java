import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int sum = 0;
		int num = 5;

		while (num < n) {
			sum += (n / num);
			num *= 5;
		}

		System.out.println(sum);
	}
}
