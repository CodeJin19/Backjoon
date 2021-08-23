import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		int list[] = new int[n];

		for (int i = 0; i < n; i++)
			list[i] = Integer.parseInt(reader.readLine());

		Arrays.sort(list);

		int ans = Integer.MIN_VALUE;
		int x = 1;

		for (int i = n - 1; 0 <= i; i--) {
			ans = Math.max(ans, x * list[i]);
			x++;
		}

		System.out.println(ans);
	}
}
