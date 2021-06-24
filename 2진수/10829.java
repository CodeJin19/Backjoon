import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		BigInteger num = new BigInteger(str);
		BigInteger two = new BigInteger("2");
		BigInteger zero = new BigInteger("0");
		BigInteger r;

		str = "";

		while (num.compareTo(zero) != 0) {
			r = num.remainder(two);
			num = num.divide(two);

			if (r.compareTo(zero) == 0)
				str += "0";
			else
				str += "1";
		}

		StringBuilder sb = new StringBuilder();

		for (int i = str.length() - 1; 0 <= i; i--)
			sb.append(str.charAt(i));

		System.out.println(sb.toString());
	}
}
