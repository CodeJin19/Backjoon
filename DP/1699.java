import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] cache = new int[n + 1];
		int[] move = new int[(int) (Math.sqrt(n)) + 1];

		for (int i = 1; i < move.length; i++)
			move[i] = i * i;

		int idx = 1;
		cache[1] = 1;

		for (int i = 2; i <= n; i++) {
			cache[i] = i;

			if (idx + 1 < move.length && 0 <= i - move[idx + 1])
				idx++;

			for (int j = 1; j <= idx; j++) {
				int d = move[j];
				cache[i] = Math.min(cache[i], cache[i - d] + 1);
			}
		}

		System.out.println(cache[n]);
	}
}
