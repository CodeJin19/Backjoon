import java.io.*;
import java.util.*;

public class Main {

	public static int min(int x, int y) {
		if (x == -1)
			return y;
		else if (y == -1)
			return x;
		else if (x < y)
			return x;
		else
			return y;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n = Integer.parseInt(reader.readLine());
		int cache[] = new int[5010];

		cache[3] = 1;
		cache[4] = -1;
		cache[5] = 1;
		cache[6] = 2;
		cache[7] = -1;

		for (int i = 8; i <= n; i++) {
			if (cache[i - 3] == -1 && cache[i - 5] == -1)
				cache[i] = -1;
			else
				cache[i] = min(cache[i - 3], cache[i - 5]) + 1;
		}

		System.out.println(cache[n]);
	}
}
