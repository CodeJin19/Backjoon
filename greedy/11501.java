import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		int len = input.length();

		StringBuilder sb = new StringBuilder();

		int idx = 0;
		int cnt = 0;

		for (int i = 0; i < len; i++) {
			if (input.charAt(i) == 'X') {
				cnt++;
			} else {
				if (cnt != 0) {
					if (cnt % 2 == 0) {
						int a = cnt / 4;
						int b = cnt % 4;

						for (int j = 0; j < a * 4; j++)
							sb.append("A");

						for (int j = 0; j < b; j++)
							sb.append("B");
					} else {
						sb = new StringBuilder();
						sb.append("-1");
						break;
					}
					
					cnt = 0;
				}

				sb.append(".");
			}
		}

		if (cnt != 0) {
			if (cnt % 2 == 0) {
				int a = cnt / 4;
				int b = cnt % 4;

				for (int j = 0; j < a * 4; j++)
					sb.append("A");

				for (int j = 0; j < b; j++)
					sb.append("B");
			} else {
				sb = new StringBuilder();
				sb.append("-1");
			}
		}
		
		System.out.println(sb);
	}
}
