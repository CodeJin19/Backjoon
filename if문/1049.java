import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int sixCost = Integer.MAX_VALUE;
		int oneCost = Integer.MAX_VALUE;

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(reader.readLine());

			sixCost = Math.min(sixCost, Integer.parseInt(st.nextToken()));
			oneCost = Math.min(oneCost, Integer.parseInt(st.nextToken()));
		}

		int ans;

		if (sixCost < oneCost * 6) {
			int x = n / 6;
			ans = x * sixCost;

			x = n - 6 * x;
			if (x * oneCost < sixCost)
				ans += x * oneCost;
			else
				ans += sixCost;
		} else {
			ans = n * oneCost;
		}

		System.out.println(ans);
	}
}
