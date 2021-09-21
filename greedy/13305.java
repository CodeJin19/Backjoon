import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] dist = new int[n - 1];
		int[] price = new int[n];

		StringTokenizer st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < n - 1; i++)
			dist[i] = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < n; i++)
			price[i] = Integer.parseInt(st.nextToken());

		BigInteger total = new BigInteger("0");
		int min = price[0];

		for (int i = 0; i < n - 1; i++) {
			min = Math.min(min, price[i]);

			BigInteger tmp = new BigInteger(min + "");
			tmp = tmp.multiply(new BigInteger(dist[i] + ""));

			total = total.add(tmp);
		}

		System.out.println(total);
	}
}
