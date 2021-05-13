import java.io.*;
import java.util.*;

public class Main {
	static int fld[][];

	static int getDegree(int idx) {
		Queue<Integer> queue = new LinkedList<Integer>();
		int now, len, cnt = -1;
		boolean cache[] = new boolean[fld.length];

		queue.offer(idx);
		cache[idx] = true;

		while (!queue.isEmpty()) {
			len = queue.size();
			cnt++;

			for (int i = 0; i < len; i++) {
				now = queue.peek();
				queue.poll();

				for (int j = 1; j < fld.length; j++) {
					if (fld[now][j] == 1 && !cache[j]) {
						queue.offer(j);
						cache[j] = true;
					}
				}
			}
		}

		return cnt;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int n = Integer.parseInt(reader.readLine());
		int degree[] = new int[n + 1];
		int x, y, len, min = Integer.MAX_VALUE;

		fld = new int[n + 1][n + 1];

		st = new StringTokenizer(reader.readLine());
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());

		while (x != -1 || y != -1) {
			fld[x][y] = 1;
			fld[y][x] = 1;

			st = new StringTokenizer(reader.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
		}

		for (int i = 1; i <= n; i++) {
			degree[i] = getDegree(i);
			min = Math.min(min, degree[i]);
		}

		len = 0;
		for (int i = 1; i <= n; i++) {
			if (degree[i] == min) {
				ans.add(i);
				len++;
			}
		}

		sb.append(min).append(" ").append(len).append("\n");

		sb.append(ans.get(0));

		for (int i = 1; i < len; i++)
			sb.append(" ").append(ans.get(i));

		System.out.println(sb);
	}
}
