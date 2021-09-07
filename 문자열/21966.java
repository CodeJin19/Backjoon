import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(reader.readLine());
		String str = reader.readLine();

		if (len < 26) {
			System.out.println(str);
		} else {
			boolean isOneSentence = true;

			for (int i = 11; i < len - 12; i++) {
				if (str.charAt(i) == '.') {
					isOneSentence = false;
					break;
				}
			}

			StringBuilder sb = new StringBuilder();

			if (isOneSentence) {
				for (int i = 0; i < 11; i++)
					sb.append(str.charAt(i));

				sb.append("...");

				for (int i = len - 11; i < len; i++)
					sb.append(str.charAt(i));
			} else {
				for (int i = 0; i < 9; i++)
					sb.append(str.charAt(i));

				sb.append("......");

				for (int i = len - 10; i < len; i++)
					sb.append(str.charAt(i));
			}

			System.out.println(sb);
		}
	}
}
