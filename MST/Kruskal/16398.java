import java.io.*;
import java.util.*;

public class Main {
	static int leader[];

	static int getLeader(int x) {
		if (leader[x] == x)
			return x;

		leader[x] = getLeader(leader[x]);
		return leader[x];
	}

	static boolean isSameGroup(int x, int y) {
		if (getLeader(x) == getLeader(y))
			return true;
		else
			return false;
	}

	static void union(int x, int y) {
		int xL = getLeader(x);
		int yL = getLeader(y);

		if (xL < yL)
			leader[yL] = xL;
		else
			leader[xL] = yL;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(reader.readLine());
		ArrayList<int[]> connList = new ArrayList<int[]>();
		leader = new int[n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());
			leader[i] = i;

			for (int j = 0; j < n; j++) {
				int cost = Integer.parseInt(st.nextToken());

				if (i < j) {
					connList.add(new int[] { cost, i, j });
				}
			}
		}

		Collections.sort(connList, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}

		});

		int cnt = 0;
		int idx = 0;
		long sum = 0;

		while (cnt < n - 1) {
			int x = connList.get(idx)[1];
			int y = connList.get(idx)[2];

			if (!isSameGroup(x, y)) {
				union(x, y);
				sum += connList.get(idx)[0];
				cnt++;
			}

			idx++;
		}

		System.out.println(sum);
	}
}
