import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());
		int list[] = new int[num];

		for (int i = 0; i < num; i++)
			list[i] = Integer.parseInt(reader.readLine());

		Arrays.sort(list);

		StringBuilder sb = new StringBuilder();

		for (int i = num - 1; 0 <= i; i--)
			sb.append(list[i]).append("\n");

		System.out.println(sb);
	}
}
