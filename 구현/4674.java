import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int key = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();

		while (key != 0) {
			String str = st.nextToken();
			int len = str.length();
			int[] cipherCode = new int[len];
			int[] plainCode = new int[len];

			for (int i = 0; i < len; i++) {
				if (str.charAt(i) == '_')
					cipherCode[i] = 0;
				else if (str.charAt(i) == '.')
					cipherCode[i] = 27;
				else
					cipherCode[i] = (int) (str.charAt(i) - 'a' + 1);
			}

			for (int i = 0; i < len; i++) {
				int idx = key * i;
				idx %= len;

				int val = cipherCode[i];
				val += i;

				while (val < 0)
					val += 28;

				while (28 <= val)
					val -= 28;

				plainCode[idx] = val;
			}

			for (int i = 0; i < len; i++) {
				if (plainCode[i] == 0)
					sb.append("_");
				else if (plainCode[i] == 27)
					sb.append(".");
				else
					sb.append((char) (plainCode[i] - 1 + 'a'));
			}

			sb.append("\n");

			st = new StringTokenizer(reader.readLine());
			key = Integer.parseInt(st.nextToken());
		}

		System.out.print(sb);
	}
}
