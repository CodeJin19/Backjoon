import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		StringBuilder tmpSb = new StringBuilder();

		for (int i = str.length() - 1; 0 <= i;) {
			int num = 0;
			int cnt = 0;
			int digit = 1;

			while (cnt < 3 && 0 <= i) {
				if (str.charAt(i) == '1')
					num += digit;
				else
					num += 0;

				digit *= 2;
				cnt++;
				i--;
			}

			tmpSb.append(num);
		}

		String tmp = tmpSb.toString();
		StringBuilder sb = new StringBuilder();

		for (int i = tmp.length() - 1; 0 <= i; i--)
			sb.append(tmp.charAt(i));

		System.out.println(sb.toString());
	}
}
