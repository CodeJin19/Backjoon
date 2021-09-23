import java.io.*;
import java.util.*;

public class Main {
	static int ans;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] list = new int[n];

		for (int i = 0; i < n; i++)
			list[i] = Integer.parseInt(reader.readLine());

		int cnt = 0;
		int prev = list[n - 1];

		for (int i = n - 2; 0 <= i; i--) {
			if (prev <= list[i]) {
				int d = list[i] - (prev - 1);
				cnt += d;
				list[i] -= d;
			}

			prev = list[i];
		}

		System.out.println(cnt);
	}
}
