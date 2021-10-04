import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		String S = reader.readLine();
		String T = reader.readLine();

		int[] cnt = new int[26];

		for (int i = 0; i < n; i++) {
			if (S.charAt(i) == T.charAt(i)) {
				int idx = (int) (S.charAt(i) - 'a');
				cnt[idx]++;
			} else {
				int idx = (int) (S.charAt(i) - 'a');
				cnt[idx]++;

				idx = (int) (T.charAt(i) - 'a');
				cnt[idx]++;
			}
		}

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < 26; i++)
			max = Math.max(max, cnt[i]);

		System.out.println(max);
	}
}
