import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static int score[][];

	public static boolean check(int arr[][]) {
		int w, d, l;
		
		for (int i = 0; i < 6; i++) {
			w = 0;
			d = 0;
			l = 0;

			for (int j = 0; j < 6; j++) {
				if (arr[i][j] == 1)
					w++;
				else if (arr[i][j] == 0)
					d++;
				else if (arr[i][j] == -1)
					l++;
			}
			
			d--;

			if (score[i][0] != w)
				return false;

			if (score[i][1] != d)
				return false;

			if (score[i][2] != l)
				return false;
		}

		return true;
	}

	public static boolean getComb(int y, int x, int arr[][]) {
		if (y == 5)
			return check(arr);

		if (x < 5) {
			arr[y][x] = 1;
			arr[x][y] = -1;
			if (getComb(y, x + 1, arr))
				return true;

			arr[y][x] = 0;
			arr[x][y] = 0;
			if (getComb(y, x + 1, arr))
				return true;

			arr[y][x] = -1;
			arr[x][y] = 1;
			if (getComb(y, x + 1, arr))
				return true;
		} else {
			arr[y][x] = 1;
			arr[x][y] = -1;
			if (getComb(y + 1, y + 2, arr))
				return true;

			arr[y][x] = 0;
			arr[x][y] = 0;
			if (getComb(y + 1, y + 2, arr))
				return true;

			arr[y][x] = -1;
			arr[x][y] = 1;
			if (getComb(y + 1, y + 2, arr))
				return true;
		}

		return false;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int arr[][];

		for (int itr = 0; itr < 4; itr++) {
			score = new int[6][3];
			arr = new int[6][6];

			if (0 < itr)
				sb.append(" ");

			st = new StringTokenizer(reader.readLine());

			for (int i = 0; i < 6; i++)
				for (int j = 0; j < 3; j++)
					score[i][j] = Integer.parseInt(st.nextToken());

			if (getComb(0, 1, arr))
				sb.append(1);
			else
				sb.append(0);
		}

		System.out.println(sb);
	}
}
