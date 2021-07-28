import java.io.*;
import java.util.*;

public class Main {
	static boolean isNum(int num) {
		int cnt = 0;
		boolean flag = false;

		while (num != 0) {
			int d = num % 10;
			num /= 10;

			if (d == 6) {
				if (flag) {
					if (++cnt == 3)
						return true;
				} else {
					flag = true;
					cnt = 1;
				}
			} else {
				flag = false;
			}
		}

		return false;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());

		if (num == 1) {
			System.out.println("666");
		} else {
			int cnt = 1;
			int n = 1665;

			while (cnt < num) {
				n++;
				while (!isNum(n))
					n++;
				cnt++;
			}

			System.out.println(n);
		}
	}
}
