import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		int[] list = new int[n];
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, list[i]);
		}

		boolean flag = false;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			if (list[i] == max && !flag)
				flag = true;
			else
				sum += list[i];
		}

		System.out.println(max * (n - 1) + sum);
	}
}
