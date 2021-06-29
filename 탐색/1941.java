import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<int[]> cache;
	static int visit[][];
	static int d[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
	static char fld[][];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str;
		fld = new char[5][5];

		for (int i = 0; i < 5; i++) {
			str = reader.readLine();

			for (int j = 0; j < 5; j++) {
				fld[i][j] = str.charAt(j);
			}
		}

		cache = new ArrayList<int[]>();
		visit = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				visit[i][j] = 1;

				ArrayList<int[]> edge = getEdge(i, j);
				ArrayList<Integer> log = new ArrayList<Integer>();
				log.add(i * 5 + j);

				if (fld[i][j] == 'Y')
					search(1, 0, edge, log);
				else
					search(1, 1, edge, log);

				visit[i][j] = -1;
			}
		}

		System.out.println(cache.size());
	}

	static ArrayList<int[]> getEdge(int ys, int xs) {
		ArrayList<int[]> ret = new ArrayList<int[]>();
		Queue<int[]> tmp = new LinkedList<int[]>();
		boolean cache[][] = new boolean[5][5];

		tmp.offer(new int[] { ys, xs });
		cache[ys][xs] = true;

		while (!tmp.isEmpty()) {
			int y = tmp.peek()[0];
			int x = tmp.peek()[1];
			tmp.poll();

			for (int i = 0; i < 4; i++) {
				int ny = y + d[i][0];
				int nx = x + d[i][1];

				if (ny < 0 || 5 <= ny || nx < 0 || 5 <= nx || visit[ny][nx] == -1 || cache[ny][nx])
					continue;

				if (visit[ny][nx] == 0) {
					ret.add(new int[] { ny, nx });
					cache[ny][nx] = true;
				} else if (visit[ny][nx] == 1) {
					tmp.offer(new int[] { ny, nx });
					cache[ny][nx] = true;
				}
			}
		}

		return ret;
	}

	static void search(int seats, int soms, ArrayList<int[]> edge, ArrayList<Integer> log) {
		if (4 <= seats - soms)
			return;

		if (4 <= soms && seats == 7) {
			int len = cache.size();
			boolean isExist = false;

			Collections.sort(log);

			for (int i = 0; i < len; i++) {
				int cnt = 0;

				for (int j = 0; j < 7; j++)
					if (log.get(j) == cache.get(i)[j])
						cnt++;

				if (cnt == 7) {
					isExist = true;
					break;
				}
			}

			if (!isExist) {
				int tmp[] = new int[7];

				for (int i = 0; i < 7; i++)
					tmp[i] = log.get(i);

				cache.add(tmp);
			}

			return;
		}

		int len = edge.size();

		for (int i = 0; i < len; i++) {
			int y = edge.get(i)[0];
			int x = edge.get(i)[1];

			visit[y][x] = 1;

			ArrayList<int[]> newEdge = getEdge(y, x);
			ArrayList<Integer> newLog = new ArrayList<Integer>();

			for (int j = 0; j < seats; j++)
				newLog.add(log.get(j));

			newLog.add(5 * y + x);

			if (fld[y][x] == 'Y')
				search(seats + 1, soms, newEdge, newLog);
			else
				search(seats + 1, soms + 1, newEdge, newLog);

			visit[y][x] = 0;
		}
	}
}
