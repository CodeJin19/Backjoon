import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static int cost[];
	static int friends[];

	public static int getLeader(int x) {
		if (friends[x] == x)
			return x;
		friends[x] = getLeader(friends[x]);
		return friends[x];
	}

	public static boolean isGroup(int x, int y) {
		if (getLeader(x) == getLeader(y))
			return true;
		else
			return false;
	}

	public static void addGroup(int x, int y) {
		x = getLeader(x);
		y = getLeader(y);

		if (cost[x] < cost[y])
			friends[y] = x;
		else
			friends[x] = y;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n, m, k, v, w, tmp, sum = 0;
		boolean cache[];

		st = new StringTokenizer(reader.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		cost = new int[n + 1];
		friends = new int[n + 1];
		cache = new boolean[n + 1];

		st = new StringTokenizer(reader.readLine());

		for (int i = 1; i <= n; i++) {
			cost[i] = Integer.parseInt(st.nextToken());
			friends[i] = i;
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(reader.readLine());
			v = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());

			addGroup(v, w);
		}

		for (int i = 1; i <= n; i++) {
			tmp = getLeader(i);
			
			if(!cache[tmp]) {
				sum += cost[tmp];
				cache[tmp] = true;
			}
			
			if(!cache[i]) {
				cache[i] = true;
			}
		}

		if (sum <= k)
			System.out.println(sum);
		else
			System.out.println("Oh no");
	}
}
