import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb;
		int T = Integer.parseInt(reader.readLine());

		for (int itr = 0; itr < T; itr++) {
			st = new StringTokenizer(reader.readLine());
			sb = new StringBuilder();

			String tmp = st.nextToken();
			int len = tmp.length();

			for (int i = len - 1; 0 <= i; i--)
				sb.append(tmp.charAt(i));

			while (st.hasMoreTokens()) {
				tmp = st.nextToken();
				len = tmp.length();

				sb.append(" ");

				for (int i = len - 1; 0 <= i; i--)
					sb.append(tmp.charAt(i));
			}

			System.out.println(sb);
		}
	}
}
