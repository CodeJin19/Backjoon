import java.io.*;
import java.util.*;

public class Main {
	static int getGCD(int y, int x) {
		if (y < x) {
			int tmp = y;
			y = x;
			x = tmp;
		}

		int r = y % x;

		while (r != 0) {
			y = x;
			x = r;
			r = y % x;
		}

		return x;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int list[] = new int[n];

		for (int i = 0; i < n; i++)
			list[i] = Integer.parseInt(reader.readLine());

		int GCD = list[1] - list[0];

		for (int i = 2; i < n; i++) {
			int len = list[i] - list[i - 1];
			GCD = getGCD(GCD, len);
		}

		int cnt = 0;
		int x = list[0];
		int idx = 1;

		while (x < list[n - 1]) {
			x += GCD;
            
			if (x == list[idx])
				idx++;
			else
				cnt++;
		}

		System.out.println(cnt);
	}
}
