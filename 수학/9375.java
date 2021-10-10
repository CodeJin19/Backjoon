import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(reader.readLine());

		for (int itr = 0; itr < T; itr++) {
			int n = Integer.parseInt(reader.readLine());
			StringTokenizer st;
			HashMap<String, Integer> clothes = new HashMap<>();

			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(reader.readLine());
				String key = st.nextToken();
				key = st.nextToken();

				if (clothes.containsKey(key))
					clothes.put(key, clothes.get(key) + 1);
				else
					clothes.put(key, 1);
			}

			long ans = 1;

			for (String key : clothes.keySet())
				ans *= (clothes.get(key) + 1);

			ans -= 1;

			sb.append(ans).append("\n");
		}

		System.out.println(sb);
	}
}
