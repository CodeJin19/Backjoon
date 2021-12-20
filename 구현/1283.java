import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		String[] strList = new String[n];
		boolean[] isUsed = new boolean[26];
		int[] key = new int[n];

		for (int i = 0; i < n; i++) {
			strList[i] = reader.readLine();
			key[i] = -1;
		}

		StringTokenizer st;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(strList[i]);
			int len = st.countTokens();
			int idx = 0;
			boolean flag = false;

			for (int j = 0; j < len; j++) {
				String str = st.nextToken();
				char initial = str.charAt(0);

				if ('a' <= initial && initial <= 'z') {
					int initialIdx = (int) (initial - 'a');

					if (!isUsed[initialIdx]) {
						isUsed[initialIdx] = true;
						key[i] = idx;
						flag = true;
						break;
					}
				} else {
					int initialIdx = (int) (initial - 'A');

					if (!isUsed[initialIdx]) {
						isUsed[initialIdx] = true;
						key[i] = idx;
						flag = true;
						break;
					}
				}

				if (!flag) {
					idx += (str.length() + 1);
				}
			}

			if (!flag) {
				len = strList[i].length();

				for (int j = 0; j < len; j++) {
					char initial = strList[i].charAt(j);

					if ('a' <= initial && initial <= 'z') {
						int initialIdx = (int) (initial - 'a');

						if (!isUsed[initialIdx]) {
							isUsed[initialIdx] = true;
							key[i] = j;
							flag = true;
							break;
						}
					} else if ('A' <= initial && initial <= 'Z') {
						int initialIdx = (int) (initial - 'A');

						if (!isUsed[initialIdx]) {
							isUsed[initialIdx] = true;
							key[i] = j;
							flag = true;
							break;
						}
					}
				}
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			if (key[i] == -1) {
				sb.append(strList[i]);
			} else {
				int len = strList[i].length();

				for (int j = 0; j < key[i]; j++)
					sb.append(strList[i].charAt(j));

				sb.append("[").append(strList[i].charAt(key[i])).append("]");

				for (int j = key[i] + 1; j < len; j++)
					sb.append(strList[i].charAt(j));
			}

			sb.append("\n");
		}

		System.out.print(sb);
	}
}
