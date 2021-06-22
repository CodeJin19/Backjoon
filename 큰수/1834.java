import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String num = reader.readLine();
		BigInteger bigNum = new BigInteger(num);
		BigInteger bigNumM = new BigInteger(num).subtract(new BigInteger("1"));
		BigInteger bigNumP = new BigInteger(num).add(new BigInteger("1"));

		System.out.println(bigNum.multiply(bigNumM).divide(new BigInteger("2")).multiply(bigNumP));
	}
}
