import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		StringBuilder sb = new StringBuilder();

		while (!"*".equals(str)) {
			int len = str.length();
			boolean isSurprise = true;

			for (int d = 1; d < len; d++) {
				boolean[][] flag = new boolean[26][26];

				for (int i = 0; i < len - d; i++) {
					int a = (int) (str.charAt(i) - 'A');
					int b = (int) (str.charAt(i + d) - 'A');

					if (!flag[a][b]) {
						flag[a][b] = true;
					} else {
						isSurprise = false;
						i = len;
						d = len;
					}
				}
			}

			if (isSurprise)
				sb.append(str).append(" is surprising.\n");
			else
				sb.append(str).append(" is NOT surprising.\n");

			str = reader.readLine();
		}

		System.out.print(sb);
	}
}
