import java.io.*;

public class Main {
	public static int swap(int x) {
		int n, num = 0;

		while (x != 0) {
			n = x % 10;
			x /= 10;
			num *= 10;
			num += n;
		}

		return num;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int k = Integer.parseInt(str.split(" ")[1]);
		int max = 0;

		for (int i = 1; i <= k; i++)
			max = Math.max(max, swap(n * i));

		System.out.println(max);
	}
}
