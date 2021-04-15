import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	static int bfs(int[][] fld, ArrayList<int[]> list) {
		Queue<int[]> queue = new LinkedList<int[]> (); 
		int x, y, nx, ny, sum = 0;
		int[][] dupFld = new int[fld.length][fld[0].length];
		int[][] d = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

		for (int i = 0; i < fld.length; i++)
			for (int j = 0; j < fld[0].length; j++)
				dupFld[i][j] = fld[i][j];

		for (int i = 0; i < list.size(); i++)
			queue.offer(new int[] { list.get(i)[0], list.get(i)[1] });

		while (!queue.isEmpty()) {
			y = queue.peek()[0];
			x = queue.peek()[1];
			queue.poll();

			for (int i = 0; i < 4; i++) {
				ny = y + d[i][0];
				nx = x + d[i][1];

				if (0 <= ny && ny < dupFld.length && 0 <= nx && nx < dupFld[0].length && dupFld[ny][nx] == 0) {
					dupFld[ny][nx] = 2;
					queue.offer(new int[] { ny, nx });
				}
			}
		}

		for (int i = 0; i < dupFld.length; i++)
			for (int j = 0; j < dupFld[0].length; j++)
				if (dupFld[i][j] == 0)
					sum++;

		return sum;
	}

	static int solve(int[][] fld, ArrayList<int[]> candList, ArrayList<int[]> gasList) {
		int[][] dupFld = new int[fld.length][fld[0].length];
		int len = candList.size();
		int ret = Integer.MIN_VALUE;

		for (int i = 0; i < fld.length; i++)
			for (int j = 0; j < fld[0].length; j++)
				dupFld[i][j] = fld[i][j];

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				for (int k = j + 1; k < len; k++) {
					dupFld[candList.get(i)[0]][candList.get(i)[1]] = 1;
					dupFld[candList.get(j)[0]][candList.get(j)[1]] = 1;
					dupFld[candList.get(k)[0]][candList.get(k)[1]] = 1;

					ret = Math.max(ret, bfs(dupFld, gasList));

					dupFld[candList.get(i)[0]][candList.get(i)[1]] = 0;
					dupFld[candList.get(j)[0]][candList.get(j)[1]] = 0;
					dupFld[candList.get(k)[0]][candList.get(k)[1]] = 0;
				}
			}
		}

		return ret;
	}

	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int fld[][] = new int[n][m];
		ArrayList<int[]> gasList = new ArrayList<int[]>();
		ArrayList<int[]> candList = new ArrayList<int[]>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());

			for (int j = 0; j < m; j++) {
				fld[i][j] = st.nextToken().charAt(0) - '0';

				if (fld[i][j] == 2)
					gasList.add(new int[] { i, j });
				else if (fld[i][j] == 0)
					candList.add(new int[] { i, j });
			}
		}

		System.out.println(solve(fld, candList, gasList));
	}
}
