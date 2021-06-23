import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int num = Integer.parseInt(reader.readLine());
		int start[] = new int[num + 1];
		int end[] = new int[num + 1];
		int n, max, time, ans = 0;

		for (int i = 1; i <= num; i++) {
			st = new StringTokenizer(reader.readLine());
			time = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());

			max = 0;

			for (int j = 0; j < n; j++) {
				max = Math.max(max, end[Integer.parseInt(st.nextToken())]);
			}

			start[i] = max;
			end[i] = max + time;
			ans = Math.max(ans, end[i]);
		}

		System.out.println(ans);
	}
}
