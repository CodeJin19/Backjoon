import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int[] cnt = new int[26];

		for (int i = 0; i < str.length(); i++)
			cnt[str.charAt(i) - 'A']++;

		int odd = 0;

		for (int i = 0; i < 26; i++)
			if (cnt[i] % 2 == 1)
				odd++;

		StringBuilder sb = new StringBuilder();

		if (odd == 0) {
			for (int i = 0; i < 26; i++)
				if (0 < cnt[i])
					for (int j = 0; j < cnt[i] / 2; j++)
						sb.append((char) ('A' + i));

			for (int i = 25; 0 <= i; i--)
				if (0 < cnt[i])
					for (int j = 0; j < cnt[i] / 2; j++)
						sb.append((char) ('A' + i));
		} else if (odd == 1) {
			int idx = -1;

			for (int i = 0; i < 26; i++) {
				if (cnt[i] % 2 == 1) {
					idx = i;
					break;
				}
			}

			for (int i = 0; i < 26; i++)
				if (0 < cnt[i])
					for (int j = 0; j < cnt[i] / 2; j++)
						sb.append((char) ('A' + i));

			sb.append((char) ('A' + idx));

			for (int i = 25; 0 <= i; i--)
				if (0 < cnt[i])
					for (int j = 0; j < cnt[i] / 2; j++)
						sb.append((char) ('A' + i));
		} else {
			sb.append("I'm Sorry Hansoo");
		}

		System.out.println(sb);
	}
}
