import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		String list[] = new String[n];

		for (int i = 0; i < n; i++)
			list[i] = reader.readLine();

		Arrays.sort(list);
		boolean flag = false;

		for (int i = 0; i < n; i++) {
			StringBuilder tmp = new StringBuilder();

			for (int j = list[i].length() - 1; 0 <= j; j--)
				tmp.append(list[i].charAt(j));

			int from = 0;
			int to = n - 1;

			while (!flag && from <= to) {
				int mid = (from + to) / 2;
				int val = tmp.toString().compareTo(list[mid]);

				if (val == 0) {
					System.out.println(tmp.length() + " " + list[mid].charAt(tmp.length() / 2));
					flag = true;
				} else if (val < 0) {
					to = mid - 1;
				} else {
					from = mid + 1;
				}
			}

			if (flag)
				break;
		}
	}
}
