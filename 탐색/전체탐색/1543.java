import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int strLen = str.length();

		String tmp = reader.readLine();
		int tmpLen = tmp.length();

		int cnt = 0;

		for (int i = 0; i < strLen - (tmpLen - 1); i++) {
			int idx = 0;

			while (idx < tmpLen && str.charAt(i + idx) == tmp.charAt(idx))
				idx++;

			if (idx == tmpLen) {
				cnt++;
				i += (idx - 1);
			}
		}

		System.out.println(cnt);
	}
}
