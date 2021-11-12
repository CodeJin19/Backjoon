import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		String str = reader.readLine();
		int len = str.length();
		int cnt = 0;
		boolean[] eaten = new boolean[len];

		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == 'P') {
				for (int j = Math.max(0, i - k); j <= Math.min(len - 1, i + k); j++) {
					if (str.charAt(j) == 'H' && !eaten[j]) {
						eaten[j] = true;
						cnt++;
						break;
					}
				}
			}
		}

		System.out.println(cnt);
	}
}
