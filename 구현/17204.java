import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[] link = new int[n];
		boolean[] visit = new boolean[n];

		for (int i = 0; i < n; i++)
			link[i] = Integer.parseInt(reader.readLine());

		int now = 0;
		int cnt = 1;
		visit[0] = true;

		while (true) {
			int next = link[now];

			if (next == k) {
				break;
			} else if (visit[next]) {
				cnt = -1;
				break;
			} else {
				cnt++;
				visit[next] = true;
				now = next;
			}
		}

		System.out.println(cnt);
	}
}
