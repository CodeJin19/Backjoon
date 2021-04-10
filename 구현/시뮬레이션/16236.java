import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Queue<int[]> q;
		ArrayList<int[]> list;
		int n = Integer.parseInt(reader.readLine());
		int fld[][] = new int[n][n];
		int d[][] = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
		int tmp[];
		int sharkY = 0, sharkX = 0, sharkSize = 0, time, size, cnt, yMin, xMin, idx, y, x, ny, nx, len, qLen;
		boolean cache[][];
		boolean flag = true;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());

			for (int j = 0; j < n; j++) {
				size = (int) (st.nextToken().charAt(0) - '0');

				fld[i][j] = size;

				if (size == 9) {
					sharkY = i;
					sharkX = j;
					sharkSize = 2;
				}
			}
		}

		time = 0;
		cnt = 0;

		while (flag) {
			cache = new boolean[n][n];
			list = new ArrayList<int[]>();
			q = new LinkedList<int[]>();
			q.offer(new int[] { sharkY, sharkX, sharkSize, 0});
			cache[sharkY][sharkX] = true;

			while (list.size() == 0 && !q.isEmpty()) {
				qLen = q.size();

				for (int i = 0; i < qLen; i++) {
					tmp = q.poll();
					y = tmp[0];
					x = tmp[1];
					size = tmp[2];
					len = tmp[3];

					if (size != 0 && size < sharkSize) {
						list.add(new int[] { y, x, size, len});
					} else {
						for (int j = 0; j < 4; j++) {
							ny = y + d[j][0];
							nx = x + d[j][1];

							if (0 <= ny && ny < n && 0 <= nx && nx < n) {
								if (fld[ny][nx] <= sharkSize && !cache[ny][nx]) {
									cache[ny][nx] = true;
									q.offer(new int[] { ny, nx, fld[ny][nx], len + 1 });
								}
							}
						}
					}
				}
			}

			if (list.size() != 0) {
				yMin = Integer.MAX_VALUE;
				xMin = Integer.MAX_VALUE;
				idx = -1;

				for (int i = 0; i < list.size(); i++)
					if (list.get(i)[0] < yMin)
						yMin = list.get(i)[0];

				for (int i = 0; i < list.size(); i++)
					if (list.get(i)[0] == yMin)
						if (list.get(i)[1] < xMin) {
							idx = i;
							xMin = list.get(i)[1];
						}

				time += list.get(idx)[3];
				fld[sharkY][sharkX] = 0;
				sharkY = list.get(idx)[0];
				sharkX = list.get(idx)[1];
				fld[sharkY][sharkX] = 0;
				cnt++;

				if (cnt == sharkSize) {
					sharkSize++;
					cnt = 0;
				}
			} else {
				flag = false;
			}
		}

		System.out.println(time);
	}
}
