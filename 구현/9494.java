import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();

		while (n != 0) {
			int idx = 0;

			for (int i = 0; i < n; i++) {
				String str = reader.readLine();
				int len = str.length();

				while (idx < len && str.charAt(idx) != ' ')
					idx++;
			}

			sb.append((idx + 1)).append("\n");

			n = Integer.parseInt(reader.readLine());
		}

		System.out.println(sb);
	}
}
