import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();

		final int ROCK = 0;
		final int PAPER = 1;
		final int SCISSORS = 2;

		for (int itr = 0; itr < t; itr++) {
			int n = Integer.parseInt(reader.readLine());

			String[] list = new String[n];
			boolean[] isSurvived = new boolean[n];
			int surviveCnt = n;

			for (int i = 0; i < n; i++) {
				list[i] = reader.readLine();
				isSurvived[i] = true;
			}

			int len = list[0].length();

			for (int i = 0; i < len; i++) {
				boolean[] flags = new boolean[3];

				for (int j = 0; j < n; j++) {
					if (isSurvived[j]) {
						if (list[j].charAt(i) == 'R')
							flags[ROCK] = true;
						else if (list[j].charAt(i) == 'P')
							flags[PAPER] = true;
						else
							flags[SCISSORS] = true;
					}
				}

				int cnt = 0;

				for (int j = 0; j < 3; j++)
					if (flags[j])
						cnt++;

				if (cnt == 2) {
					char target = '.';

					if (flags[ROCK] && flags[PAPER]) {
						target = 'R';
					} else if (flags[PAPER] && flags[SCISSORS]) {
						target = 'P';
					} else if (flags[SCISSORS] && flags[ROCK]) {
						target = 'S';
					}

					for (int j = 0; j < n; j++) {
						if (isSurvived[j] && list[j].charAt(i) == target) {
							isSurvived[j] = false;
							surviveCnt--;
						}
					}
				}

				if (surviveCnt == 1)
					break;
			}

			if (surviveCnt == 1) {
				for (int i = 0; i < n; i++) {
					if (isSurvived[i]) {
						sb.append((i + 1)).append("\n");
						break;
					}
				}
			} else {
				sb.append("0\n");
			}
		}

		System.out.println(sb);
	}
}
