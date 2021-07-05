import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		StringBuilder tmp = new StringBuilder();
		String num = reader.readLine();
		int len = num.length();
		int d;
		boolean carry = false;

		for (int i = len - 1; 0 < i; i--) {
			d = num.charAt(i) - '0';

			if (carry)
				d++;

			if ('5' <= d + '0')
				carry = true;
			else
				carry = false;

			tmp.append("0");
		}

		d = num.charAt(0) - '0';

		if (carry)
			d++;

		if (d <= 9)
			tmp.append((char) (d + '0'));
		else
			tmp.append("0").append("1");

		len = tmp.length();
		for (int i = len - 1; 0 <= i; i--)
			ans.append(tmp.charAt(i));

		System.out.println(ans);
	}
}
