import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		int cnt[] = new int[N + 2];

		for (int i = 1; i <= N; i++)
			cnt[i] = 1;

		st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < S; i++)
			cnt[Integer.parseInt(st.nextToken())]--;

		st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < R; i++)
			cnt[Integer.parseInt(st.nextToken())]++;

		for (int i = 1; i <= N; i++) {
			if (cnt[i] == 0) {
				if(1 < cnt[i - 1]) {
					cnt[i - 1]--;
					cnt[i]++;
				} else if(1 < cnt[i + 1]) {
					cnt[i + 1]--;
					cnt[i]++;
				}
			}
		}

		int ans = 0;

		for (int i = 1; i <= N; i++)
			if (cnt[i] == 0)
				ans++;

		System.out.println(ans);
	}
}
