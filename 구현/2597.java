import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double points[][] = new double[3][2];
		double left = 0;
		double right = Integer.parseInt(reader.readLine());

		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			points[i][0] = Integer.parseInt(st.nextToken());
			points[i][1] = Integer.parseInt(st.nextToken());

			if (points[i][1] < points[i][0]) {
				double tmp = points[i][1];
				points[i][1] = points[i][0];
				points[i][0] = tmp;
			}
		}

		for (int k = 0; k < 3; k++) {
			if (points[k][0] == points[k][1])
				continue;

			double mid = (points[k][0] + points[k][1]) / 2;

			if (mid - left <= right - mid) {
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 2; j++) {
						if (left <= points[i][j] && points[i][j] <= mid) {
							points[i][j] = mid * 2 - points[i][j];
						}
					}
				}

				left = mid;
			} else {
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 2; j++) {
						if (mid <= points[i][j] && points[i][j] <= right) {
							points[i][j] = mid * 2 - points[i][j];
						}
					}
				}

				right = mid;
			}
		}

		String ans = String.format("%.1f", right - left);
		System.out.println(ans);
	}
}
