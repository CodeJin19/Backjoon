import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		String word = reader.readLine();
		int[] wordCnt = new int[26];
		int wordLen = word.length();

		for (int i = 0; i < wordLen; i++)
			wordCnt[word.charAt(i) - 'A']++;

		int cnt = 0;

		for (int itr = 1; itr < n; itr++) {
			String str = reader.readLine();
			int strLen = str.length();
			int[] strCnt = new int[26];

			for (int i = 0; i < strLen; i++)
				strCnt[str.charAt(i) - 'A']++;

			if (wordLen == strLen) {
				int tmp = 0;

				for (int i = 0; i < 26; i++)
					if (wordCnt[i] == strCnt[i])
						tmp++;

				if (tmp == 26) {
					cnt++;
				} else {
					int diff = 0;
					boolean flag = true;

					for (int i = 0; i < 26; i++) {
						if (Math.abs(wordCnt[i] - strCnt[i]) == 1) {
							diff++;
						} else if (1 < Math.abs(wordCnt[i] - strCnt[i])) {
							flag = false;
							break;
						}
					}

					if (flag && diff == 2)
						cnt++;
				}
			} else if (Math.abs(wordLen - strLen) == 1) {
				int diff = 0;
				boolean flag = true;

				for (int i = 0; i < 26; i++) {
					if (Math.abs(wordCnt[i] - strCnt[i]) == 1) {
						diff++;
					} else if (1 < Math.abs(wordCnt[i] - strCnt[i])) {
						flag = false;
						break;
					}
				}

				if (flag && diff == 1)
					cnt++;
			}
		}

		System.out.println(cnt);
	}
}
