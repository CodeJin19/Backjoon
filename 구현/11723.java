import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
		int n = Integer.parseInt(reader.readLine());
		int num;
		boolean list[] = new boolean[21];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());
			str = st.nextToken();

			switch (str.charAt(1)) {
			case 'd': // add
				num = Integer.parseInt(st.nextToken());
				list[num] = true;
				break;
			case 'e': // remove
				num = Integer.parseInt(st.nextToken());
				list[num] = false;
				break;
			case 'h': // check
				num = Integer.parseInt(st.nextToken());
				if (list[num])
					sb.append(1);
				else
					sb.append(0);
				sb.append("\n");
				break;
			case 'o': // toggle
				num = Integer.parseInt(st.nextToken());
				list[num] = !list[num];
				break;
			case 'l': // all
				for (int j = 1; j < 21; j++)
					list[j] = true;
				break;
			case 'm': // empty
				for (int j = 1; j < 21; j++)
					list[j] = false;
				break;
			}
		}

		System.out.println(sb);
	}
}
