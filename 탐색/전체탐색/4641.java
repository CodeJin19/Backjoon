import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int num = Integer.parseInt(st.nextToken());

		while (num != -1) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int cnt = 0;

			while (num != 0) {
				list.add(num);
				num = Integer.parseInt(st.nextToken());
			}

			int len = list.size();

			for (int i = 0; i < len; i++) {
				for (int j = i + 1; j < len; j++) {
					int x = list.get(i);
					int y = list.get(j);

					if (x < y && 2 * x == y)
						cnt++;
					else if (2 * y == x)
						cnt++;
				}
			}

			System.out.println(cnt);

			st = new StringTokenizer(reader.readLine());
			num = Integer.parseInt(st.nextToken());
		}
	}
}
