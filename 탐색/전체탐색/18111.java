import java.io.*;
import java.util.*;

public class Main {
	static int[][] fld;
	static int time;
	static int height;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		fld = new int[n][m];

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		time = Integer.MAX_VALUE;
		height = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());

			for (int j = 0; j < m; j++) {
				fld[i][j] = Integer.parseInt(st.nextToken());
				min = Math.min(min, fld[i][j]);
				max = Math.max(max, fld[i][j]);
			}
		}

		for (int i = min; i <= max; i++) {
			solve(i, b);
		}

		System.out.println(time + " " + height);
	}

	static void solve(int targetHeight, int b) {
		int currentTime = 0;

		for (int i = 0; i < fld.length; i++) {
			for (int j = 0; j < fld[0].length; j++) {
				if (time < currentTime)
					return;

				if (fld[i][j] < targetHeight) {
					currentTime += (targetHeight - fld[i][j]);
					b -= (targetHeight - fld[i][j]);
				} else {
					currentTime += ((fld[i][j] - targetHeight) * 2);
					b += (fld[i][j] - targetHeight);
				}
			}
		}

		if (b < 0) {

		} else if (currentTime < time) {
			time = currentTime;
			height = targetHeight;
		} else if (currentTime == time && height < targetHeight) {
			height = targetHeight;
		}
	}
}
