import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int len = str.length();
		int flag = 0;
		int total = 1;

		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == 'd') {
				if (flag == 1) {
					total *= 9;
				} else {
					total *= 10;
					flag = 1;
				}
			} else {
				if (flag == -1) {
					total *= 25;
				} else {
					total *= 26;
					flag = -1;
				}
			}
		}

		System.out.println(total);
	}
}
