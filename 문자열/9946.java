import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str1 = reader.readLine();
		String str2 = reader.readLine();
		int cnt = 1;

		while (str1.compareTo("END") != 0 || str2.compareTo("END") != 0) {
			int len1 = str1.length();
			int len2 = str2.length();

			boolean flag = true;

			if (len1 != len2) {
				flag = false;
			} else {
				int cnt1[] = new int[26];
				int cnt2[] = new int[26];

				for (int i = 0; i < len1; i++) {
					cnt1[(int) (str1.charAt(i) - 'a')]++;
					cnt2[(int) (str2.charAt(i) - 'a')]++;
				}

				for (int i = 0; i < 26; i++) {
					if (cnt1[i] != cnt2[i]) {
						flag = false;
						break;
					}
				}
			}

			if (flag)
				System.out.println("Case " + cnt + ": same");
			else
				System.out.println("Case " + cnt + ": different");

			str1 = reader.readLine();
			str2 = reader.readLine();
			cnt++;
		}
	}
}
