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

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++)
			sb.append(list[i]).append("\n");

		System.out.print(sb);
	}
}
