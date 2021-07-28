import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		String num = reader.readLine();
		int len = num.length();
		int sum = 0;
		int cnt[] = new int[10];

		for (int i = 0; i < len; i++) {
			int d = num.charAt(i) - '0';

			sum += d;
			cnt[d] ++;
		}

		if (0 < cnt[0] && sum % 3 == 0) {
			for(int i = 9; 0 <= i; i--) {
				while(0 < cnt[i]) {
					cnt[i]--;
					ans.append(i);
				}
			}

			System.out.println(ans);
		} else {
			System.out.println("-1");
		}
	}
}
