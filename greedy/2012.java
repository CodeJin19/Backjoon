import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		int[] list = new int[n];

		for (int i = 0; i < n; i++)
			list[i] = Integer.parseInt(reader.readLine());

		Arrays.sort(list);

		long sum = 0;

		for (int i = 0; i < n; i++)
			sum += (long) Math.abs((i + 1) - list[i]);

		System.out.println(sum);
	}
}
