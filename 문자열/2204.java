import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();

		while (N != 0) {
			String ansOr = reader.readLine();
			String ansLo = ansOr.toLowerCase();

			for (int i = 1; i < N; i++) {
				String tmpOr = reader.readLine();
				String tmpLo = tmpOr.toLowerCase();

				if (0 < ansLo.compareTo(tmpLo)) {
					ansOr = tmpOr;
					ansLo = tmpLo;
				}
			}

			sb.append(ansOr).append("\n");

			N = Integer.parseInt(reader.readLine());
		}

		System.out.print(sb);
	}
}
