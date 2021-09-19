import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] cache = new int[n + 1];
		int movable = 2;

		cache[1] = 1;

		for (int i = 2; i <= n; i++) {
			if (movable * movable == i) {
				movable++;
				cache[i] = 1;
			} else {
				cache[i] = Integer.MAX_VALUE;

				for (int j = 1; j < movable; j++) {
					cache[i] = Math.min(cache[i], cache[i - j * j] + 1);
				}
			}
		}

		System.out.println(cache[n]);
	}
}
