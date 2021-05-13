import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer> link[];
	static int degree1[];
	static int degree2[];
	static int ans[];
	static boolean isCycle[];
	static boolean isVisited[];

	static void check(int idx) {
		if (2 < degree2[idx]) {
			degree2[idx] -= 1;
			return;
		}

		isCycle[idx] = false;
		isVisited[idx] = true;

		int len = link[idx].size();

		for (int i = 0; i < len; i++)
			if (!isVisited[link[idx].get(i)])
				check(link[idx].get(i));
	}

	static void setLen(int idx, int len) {
		ans[idx] = len;
		isVisited[idx] = true;

		int size = link[idx].size();

		for (int i = 0; i < size; i++)
			if (!isVisited[link[idx].get(i)])
				setLen(link[idx].get(i), len + 1);
	}

	static void startFrom(int idx) {
		int len = link[idx].size();

		for (int i = 0; i < len; i++)
			if (!isCycle[link[idx].get(i)])
				setLen(link[idx].get(i), 1);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(reader.readLine());
		link = new ArrayList[n + 1];
		degree1 = new int[n + 1];
		degree2 = new int[n + 1];
		ans = new int[n + 1];
		isCycle = new boolean[n + 1];
		isVisited = new boolean[n + 1];
		int from, to, idx;
		boolean flag;

		for (int i = 1; i <= n; i++) {
			link[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());
			from = Integer.parseInt(st.nextToken());
			to = Integer.parseInt(st.nextToken());

			link[from].add(to);
			link[to].add(from);

			degree1[from] += 1;
			degree1[to] += 1;
			degree2[from] += 1;
			degree2[to] += 1;
		}

		flag = true;

		while (flag) {
			flag = false;

			for (int i = 1; i <= n; i++) {
				if (degree1[i] == 1 && !isVisited[i]) {
					flag = true;
					isCycle[i] = false;
					isVisited[i] = true;

					check(link[i].get(0));
				}
			}
		}

		for (int i = 1; i <= n; i++)
			if (!isVisited[i])
				isCycle[i] = true;

		isVisited = new boolean[n + 1];

		for (int i = 1; i <= n; i++) {
			if (isCycle[i]) {
				isVisited[i] = true;

				if (2 < degree1[i]) {
					startFrom(i);
				}
			}
		}

		for (int i = 1; i <= n; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println();
	}
}
