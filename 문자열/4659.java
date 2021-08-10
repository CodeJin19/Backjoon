import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		StringBuilder sb = new StringBuilder();

		while (input.compareTo("end") != 0) {
			boolean flag = true;
			boolean vowel = false;

			int len = input.length();
			char prev = input.charAt(0);
			int cnt = 0;

			if (prev == 'a' || prev == 'e' || prev == 'i' || prev == 'o' || prev == 'u') {
				vowel = true;
				cnt = 1;
			} else {
				cnt = -1;
			}

			for (int i = 1; i < len; i++) {
				if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
						|| input.charAt(i) == 'u') {
					vowel = true;

					if (cnt < 0)
						cnt = 1;
					else
						cnt++;
				} else {
					if (0 < cnt)
						cnt = -1;
					else
						cnt--;
				}
				
				if(input.charAt(i) == prev) {
					if(prev != 'e' && prev != 'o') {
						flag = false;
						break;
					}	
				}

				if (cnt == 3 || cnt == -3) {
					flag = false;
					break;
				}

				prev = input.charAt(i);
			}

			sb.append("<").append(input).append("> is");

			if (!flag || !vowel)
				sb.append(" not");

			sb.append(" acceptable.\n");

			input = reader.readLine();
		}

		System.out.print(sb);
	}
}
