import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		String[] list = new String[n];

		for (int i = 0; i < n; i++)
			list[i] = reader.readLine();

		int cnt = 0;

		for (int i = 0; i < m; i++) {
			String str = reader.readLine();

			for (int j = 0; j < n; j++) {
				if (str.compareTo(list[j]) == 0) {
					cnt++;
					break;
				}
			}
		}

		System.out.println(cnt);
	}
}
