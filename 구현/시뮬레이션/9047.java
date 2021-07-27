import java.io.*;
import java.util.*;

public class Main {
	static int big;
	static int small;

	static void getNext(int num) {
		int cnt[] = new int[10];
		int total = 0;

		while (num != 0) {
			int idx = num % 10;
			cnt[idx]++;
			total++;
			num /= 10;
		}

		if (total != 4)
			cnt[0] += (4 - total);

		big = 0;

		for (int i = 9; 0 <= i; i--) {
			while (0 < cnt[i]) {
				cnt[i]--;
				big *= 10;
				big += i;
			}
		}

		int tmp = big;
		small = 0;

		while (tmp != 0) {
			small *= 10;
			small += (tmp % 10);
			tmp /= 10;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());

		for (int itr = 0; itr < T; itr++) {
			int num = Integer.parseInt(reader.readLine());
			int cnt = 0;

			while (num != 6174) {
				getNext(num);
				num = big - small;
				cnt++;
			}

			System.out.println(cnt);
		}
	}
}
