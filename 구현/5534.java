import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(reader.readLine());
		String str = reader.readLine();
		int strLen = str.length();
		int ans = 0;

		for (int itr = 0; itr < T; itr++) {
			String tmp = reader.readLine();
			int len = tmp.length();

			for (int i = 0; i < len; i++) {
				boolean flag = false;

				if (tmp.charAt(i) == str.charAt(0)) {
					for (int j = 1; i + (strLen - 1) * j < len; j++) {
						flag = true;

						for (int k = 1; k < strLen; k++) {
							if (tmp.charAt(i + j * k) != str.charAt(k)) {
								flag = false;
								break;
							}
						}

						if (flag)
							break;
					}
				}

				if (flag) {
					ans++;
					break;
				}
			}
		}

		System.out.println(ans);
	}
}
