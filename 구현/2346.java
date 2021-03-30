import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String str;
		int n = Integer.parseInt(reader.readLine());
		int list[] = new int[n + 1];
		int idx, diff;

		str = reader.readLine();
		st = new StringTokenizer(str, " ");

		for (int i = 1; i <= n; i++)
			list[i] = Integer.parseInt(st.nextToken());

		idx = 1;
		sb.append(idx);

		for (int i = 1; i < n; i++) {
			diff = list[idx];
			list[idx] = 0;

			if (0 < diff) {
				while (diff != 0) {					
					idx++;
					if(n < idx)
						idx -= n;
					
					if(list[idx] != 0)
						diff--;
				}
			} else {
				while (diff != 0) {					
					idx--;
					if(idx < 1)
						idx += n;
					
					if(list[idx] != 0)
						diff++;
				}
			}

			sb.append(" ").append(idx);
		}

		System.out.println(sb);
	}
}
