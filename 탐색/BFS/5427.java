import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str;
		Queue<int[]> fire;
		Queue<int[]> move;
		int T = Integer.parseInt(reader.readLine());
		int d[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		int map[][];
		int w, h, y, x, time, ny, nx, ans;
		char fld[][];
		boolean isVisited[][];

		for (int test_case = 0; test_case < T; test_case++) {
			st = new StringTokenizer(reader.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());

			fire = new LinkedList<int[]>();
			move = new LinkedList<int[]>();

			fld = new char[h][w];
			map = new int[h][w];
			isVisited = new boolean[h][w];

			for (int i = 0; i < h; i++) {
				str = reader.readLine();

				for (int j = 0; j < w; j++) {
					map[i][j] = -1;
					isVisited[i][j] = false;
					fld[i][j] = str.charAt(j);

					if (fld[i][j] == '@') {
						move.offer(new int[] {i, j, 0});
						isVisited[i][j] = true;
					} else if (fld[i][j] == '*') {
						map[i][j] = 0;
						fire.offer(new int[] { i, j, 0 });
					}
				}
			}
			
			while (!fire.isEmpty()) {
				y = fire.peek()[0];
				x = fire.peek()[1];
				time = fire.peek()[2];
				fire.poll();

				for (int i = 0; i < 4; i++) {
					ny = y + d[i][0];
					nx = x + d[i][1];

					if (ny < 0 || h <= ny || nx < 0 || w <= nx)
						continue;

					if (fld[ny][nx] == '#' || map[ny][nx] != -1)
						continue;

					map[ny][nx] = time + 1;
					fire.offer(new int[] { ny, nx, time + 1 });
				}
			}

			ans = Integer.MAX_VALUE;

			while(!move.isEmpty()) {
				y = move.peek()[0];
				x = move.peek()[1];
				time = move.peek()[2];
				move.poll();
				
				if(y == 0 || y == map.length - 1 || x == 0 || x == map[0].length - 1) {
					ans = Math.min(ans, time + 1);
					continue;
				}

				for (int i = 0; i < 4; i++) {
					ny = y + d[i][0];
					nx = x + d[i][1];

					if (ny < 0 || h <= ny || nx < 0 || w <= nx)
						continue;
					
					if (fld[ny][nx] == '#' || (-1 < map[ny][nx] && map[ny][nx] <= time + 1) || isVisited[ny][nx])
						continue;

					move.offer(new int[] {ny, nx, time + 1});
					isVisited[ny][nx] = true;
				}
			}

			if (ans == Integer.MAX_VALUE) {
				System.out.println("IMPOSSIBLE");
			} else {
				System.out.println(ans);
			}
		}
	}
}
