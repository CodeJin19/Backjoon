import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		int[] cnt = new int[n + 1];

		if (n <= 7) {
			switch (n) {
            case 0:
				System.out.println(0);
				break;
			case 1:
			case 2:
			case 5:
			case 7:
				System.out.println(1);
				break;
			case 3:
			case 4:
			case 6:
				System.out.println(2);
				break;
			}
		} else {
			cnt[1] = 1;
			cnt[2] = 1;
			cnt[5] = 1;
			cnt[7] = 1;

			cnt[3] = 2;
			cnt[4] = 2;
			cnt[6] = 2;

			for (int i = 8; i <= n; i++) {
				int min = cnt[i - 1] + 1;
				min = Math.min(min, cnt[i - 2] + 1);
				min = Math.min(min, cnt[i - 5] + 1);
				min = Math.min(min, cnt[i - 7] + 1);
				cnt[i] = min;
			}

			System.out.println(cnt[n]);
		}
	}
}
