import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static int d[][] = { {}, { -1, 0 }, { -1, -1 }, { 0, -1 }, { 1, -1 }, { 1, 0 }, { 1, 1 }, { 0, 1 }, { -1, 1 } };

	public static int solve(int sharkY, int sharkX, int fld[][][], int list[][], boolean isSurvived[], int cache) {
		int newFld[][][] = new int[4][4][2];
		int newList[][] = new int[17][2];
		boolean newIsSurvived[] = new boolean[17];
		int tmp[] = new int[2];
		int ret;
		int y, x, ny, nx, sharkDir, cnt, dir, max = 0;
		boolean isSwapped;

		for (int i = 0; i < 17; i++) {
			newIsSurvived[i] = isSurvived[i];
			newList[i][0] = list[i][0];
			newList[i][1] = list[i][1];
		}

		for (int a = 0; a < 4; a++)
			for (int b = 0; b < 4; b++)
				for (int c = 0; c < 2; c++)
					newFld[a][b][c] = fld[a][b][c];
		
		sharkDir = newFld[sharkY][sharkX][1];
		ret = newFld[sharkY][sharkX][0];
		newIsSurvived[newFld[sharkY][sharkX][0]] = false;

		for (int i = 1; i < 17; i++) {
			if (newIsSurvived[i]) {
				isSwapped = false;

				y = newList[i][0];
				x = newList[i][1];
				dir = newFld[y][x][1];
				cnt = 1;

				while (cnt != 9 && !isSwapped) { // finding direction
					ny = newList[i][0] + d[dir][0];
					nx = newList[i][1] + d[dir][1];

					if (0 <= ny && ny < 4 && 0 <= nx && nx < 4) {
						if (ny != sharkY || nx != sharkX) {
							newList[newFld[ny][nx][0]][0] = y;
							newList[newFld[ny][nx][0]][1] = x;

							newList[newFld[y][x][0]][0] = ny;
							newList[newFld[y][x][0]][1] = nx;

							tmp[0] = newFld[ny][nx][0];
							tmp[1] = newFld[ny][nx][1];

							newFld[ny][nx][0] = newFld[y][x][0];
							newFld[ny][nx][1] = dir;

							newFld[y][x][0] = tmp[0];
							newFld[y][x][1] = tmp[1];

							isSwapped = true;
						}
					}

					if (!isSwapped) {
						dir++;
						cnt++;

						if (dir == 9)
							dir = 1;
					}
				}
			}
		}

		ny = sharkY;
		nx = sharkX;

		for (int i = 1; i < 4; i++) {
			ny += d[sharkDir][0];
			nx += d[sharkDir][1];

			if (0 <= ny && ny < 4 && 0 <= nx && nx < 4) {
				if (newIsSurvived[newFld[ny][nx][0]]) {
					max = Math.max(max, solve(ny, nx, newFld, newList, newIsSurvived, cache + 1));
				}
			} else {
				break;
			}
		}

		return ret + max;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int y, x, dir, no, sum;
		int list[][] = new int[17][2];
		boolean isSurvived[] = new boolean[17];
		int fld[][][] = new int[4][4][2];

		for (int i = 0; i < 4; i++) {
			st = new StringTokenizer(reader.readLine());

			for (int j = 0; j < 4; j++) {
				no = Integer.parseInt(st.nextToken());
				dir = Integer.parseInt(st.nextToken());

				fld[i][j][0] = no;
				fld[i][j][1] = dir;
				list[no][0] = i;
				list[no][1] = j;
				isSurvived[no] = true;
			}
		}

		y = 0;
		x = 0;

		System.out.println(solve(y, x, fld, list, isSurvived, 0));
	}
}
