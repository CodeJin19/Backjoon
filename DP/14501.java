import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static int solve(int fld[][], int day) {
		if (fld.length <= day)
			return 0;

		int ret = 0;

		if (day + fld[day][0] <= fld.length)
			ret = Math.max(ret, fld[day][1] + solve(fld, day + fld[day][0]));
		
		ret = Math.max(ret, solve(fld, day + 1));		

		return ret;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(reader.readLine());
		int fld[][] = new int[N + 1][2];

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(reader.readLine());

			fld[i][0] = Integer.parseInt(st.nextToken());
			fld[i][1] = Integer.parseInt(st.nextToken());
		}

		System.out.println(solve(fld, 1));
	}
}
