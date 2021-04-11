import java.io.*;
import java.util.*;

public class Main {
	static int group[];

	static class edge implements Comparable<edge> {
		public int node1;
		public int node2;
		public int weight;

		public edge(int node1, int node2, int weight) {
			super();
			this.node1 = node1;
			this.node2 = node2;
			this.weight = weight;
		}

		@Override
		public int compareTo(edge o) {
			return this.weight - o.weight;
		}
	}

	public static int getLeader(int x) {
		if (group[x] == x)
			return x;
		group[x] = getLeader(group[x]);
		return group[x];
	}

	public static boolean isUnion(int x, int y) {
		if (getLeader(x) == getLeader(y))
			return true;
		else
			return false;
	}

	public static void union(int x, int y) {
		int xL = getLeader(x);
		int yL = getLeader(y);

		if (xL < yL)
			group[yL] = xL;
		else
			group[xL] = yL;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		edge list[] = new edge[m];
		edge newEdge;
		group = new int[n + 1];
		int sum = 0;
		int idx = 0;
        int cnt = 0;

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(reader.readLine());

			newEdge = new edge(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken()));
			list[i] = newEdge;
		}
		
		for(int i = 0; i < n + 1; i++) {
			group[i] = i;
		}

		Arrays.sort(list);

		while (idx < m && cnt != n - 2) {
			if (!isUnion(list[idx].node1, list[idx].node2)) {
				sum += list[idx].weight;
				union(list[idx].node1, list[idx].node2);
                cnt++;
			}

			idx++;
		}

		System.out.println(sum);
	}
}
