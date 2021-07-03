import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = reader.readLine();
		int n = str.length();
		int r = 0;
		int c = 0;

		for (int i = (int) Math.sqrt(n); 1 <= i; i--) {
			if (n % i == 0) {
				r = i;
				c = n / i;
				break;
			}
		}

		char arr[][] = new char[r][c];
		int idx = 0;

		for (int j = 0; j < c; j++)
			for (int i = 0; i < r; i++)
				arr[i][j] = str.charAt(idx++);

		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				sb.append(arr[i][j]);

		System.out.println(sb);
	}
}
