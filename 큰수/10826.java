import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static int ans;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		if (n == 0) {
			System.out.println(0);
		} else if (n == 1) {
			System.out.println(1);
		} else {
			BigInteger prev2 = new BigInteger("0");
			BigInteger prev = new BigInteger("1");
			BigInteger now = new BigInteger("1");

			for (int i = 1; i < n; i++) {
				now = prev.add(prev2);
				prev2 = prev;
				prev = now;
			}

			System.out.println(now);
		}
	}
}
