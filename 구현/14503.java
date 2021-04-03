import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int fld[][];
		int n, m, r, c, d, cnt = 0;
		boolean isQuit = false;
		boolean cache[][];

		// 입력 처리
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		fld = new int[n][m];
		cache = new boolean[n][m];

		str = reader.readLine();
		st = new StringTokenizer(str, " ");

		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; i++) {
			str = reader.readLine();
			st = new StringTokenizer(str, " ");

			for (int j = 0; j < m; j++) {
				fld[i][j] = (int) (st.nextToken().charAt(0) - '0');
				cache[i][j] = false;
			}
		}

		// 무한반복
		while (!isQuit) {
			
			// 이미 청소 했으면 cnt 처리 예외
			if (!cache[r][c]) {
				cache[r][c] = true;
				cnt++;
			}

			switch (d) {
			case 0: // up
				if (0 < c && fld[r][c - 1] == 0 && !cache[r][c - 1]) {
					c--;
					d = 3;
				} else if (r < n - 1 && fld[r + 1][c] == 0 && !cache[r + 1][c]) {
					r++;
					d = 2;
				} else if (c < m - 1 && fld[r][c + 1] == 0 && !cache[r][c + 1]) {
					c++;
					d = 1;
				} else if (0 < r && fld[r - 1][c] == 0 && !cache[r - 1][c]) {
					r--;
					d = 0;
				} else if (r < n - 1 && fld[r + 1][c] == 0) {
					r++;
				} else {
					isQuit = true;
				}
				break;
			case 1: // right
				if (0 < r && fld[r - 1][c] == 0 && !cache[r - 1][c]) {
					r--;
					d = 0;
				} else if (0 < c && fld[r][c - 1] == 0 && !cache[r][c - 1]) {
					c--;
					d = 3;
				} else if (r < n - 1 && fld[r + 1][c] == 0 && !cache[r + 1][c]) {
					r++;
					d = 2;
				} else if (c < m - 1 && fld[r][c + 1] == 0 && !cache[r][c + 1]) {
					c++;
					d = 1;
				} else if (0 < c && fld[r][c - 1] == 0) {
					c--;
				} else {
					isQuit = true;
				}
				break;
			case 2: // down
				if (c < m - 1 && fld[r][c + 1] == 0 && !cache[r][c + 1]) {
					c++;
					d = 1;
				} else if (0 < r && fld[r - 1][c] == 0 && !cache[r - 1][c]) {
					r--;
					d = 0;
				} else if (0 < c && fld[r][c - 1] == 0 && !cache[r][c - 1]) {
					c--;
					d = 3;
				} else if (r < n - 1 && fld[r + 1][c] == 0 && !cache[r + 1][c]) {
					r++;
					d = 2;
				} else if (0 < r && fld[r - 1][c] == 0) {
					r--;
				} else {
					isQuit = true;
				}
				break;
			case 3: // left
				if (r < n - 1 && fld[r + 1][c] == 0 && !cache[r + 1][c]) {
					r++;
					d = 2;
				} else if (c < m - 1 && fld[r][c + 1] == 0 && !cache[r][c + 1]) {
					c++;
					d = 1;
				} else if (0 < r && fld[r - 1][c] == 0 && !cache[r - 1][c]) {
					r--;
					d = 0;
				} else if (0 < c && fld[r][c - 1] == 0 && !cache[r][c - 1]) {
					c--;
					d = 3;
				} else if (c < m - 1 && fld[r][c + 1] == 0) {
					c++;
				} else {
					isQuit = true;
				}
				break;
			}
		}

		System.out.println(cnt);
	}
}
