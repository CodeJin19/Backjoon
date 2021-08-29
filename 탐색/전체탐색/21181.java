import java.io.*;
import java.util.*;

public class Main {
	static int ans;
	static int list[];

	static void getComb(int x) {
		for (int i = x + 1; i < list.length; i++) {
			int y = i;
			int sum = 0;
			boolean flag = true;

			for (int j = 0; j < list.length; j++) {
				if (ans <= sum) {
					flag = false;
					break;
				}

				if (j != x && j != y) {
					int tmpX = list[j] - list[x];
					int tmpY = list[j] - list[y];

					sum += Math.min(tmpX * tmpX, tmpY * tmpY);
				}
			}

			if (flag)
				ans = Math.min(ans, sum);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		list = new int[n];

		for (int i = 0; i < n; i++)
			list[i] = Integer.parseInt(reader.readLine());

		ans = Integer.MAX_VALUE;

		for (int i = 0; i < n - 1; i++)
			getComb(i);

		System.out.println(ans);
	}
}
