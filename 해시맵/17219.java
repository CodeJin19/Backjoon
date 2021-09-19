import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		HashMap<String, String> list = new HashMap<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());

			String site = st.nextToken();
			String pswd = st.nextToken();

			list.put(site, pswd);
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < m; i++) {
			String site = reader.readLine();
			sb.append(list.get(site)).append("\n");
		}

		System.out.print(sb);
	}
}
