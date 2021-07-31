import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int n = Integer.parseInt(reader.readLine());

		int num[] = new int[n];
		st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < n; i++)
			num[i] = Integer.parseInt(st.nextToken());

		int number = 0;
		int digit = 1;

		for (int i = n - 1; 0 <= i; i--) {
			number += (digit * num[i]);
			digit *= a;
		}

		Stack<Integer> stck = new Stack<Integer>();

		while (number != 0) {
			int r = number % b;
			stck.push(r);
			number /= b;
		}

		while (!stck.isEmpty())
			System.out.print(stck.pop() + " ");
		System.out.println();
	}
}
