import java.io.*;
import java.util.*;

public class Main {
	static int[] leader;

	static int getLeader(int idx) {
		if (leader[idx] == idx) {
			return idx;
		} else {
			leader[idx] = getLeader(leader[idx]);
			return leader[idx];
		}
	}

	static void join(int y, int x) {
		int yLeader = getLeader(y);
		int xLeader = getLeader(x);

		if (yLeader < xLeader)
			leader[xLeader] = yLeader;
		else if (xLeader < yLeader)
			leader[yLeader] = xLeader;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		leader = new int[n + 1];

		for (int i = 1; i <= n; i++)
			leader[i] = i;

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(reader.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			join(u, v);
		}

		int cnt = 0;

		for (int i = 1; i <= n; i++)
			if (leader[i] == i)
				cnt++;

		System.out.println(cnt);
	}
}
