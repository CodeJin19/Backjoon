import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		ArrayList<int[]> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String str = reader.readLine();
			int tmp[] = new int[26];
			int len = str.length();

			for (int j = 0; j < len; j++) {
				int idx = str.charAt(j) - 'a';
				tmp[idx]++;
			}

			len = list.size();
			boolean isThere = false;

			for (int j = 0; j < len; j++) {
				boolean flag = true;

				for (int k = 0; k < 26; k++) {
					if (tmp[k] != list.get(j)[k]) {
						flag = false;
						break;
					}
				}

				if (flag) {
					isThere = true;
					break;
				}
			}

			if (!isThere)
				list.add(tmp);
		}

		System.out.println(list.size());
	}
}
