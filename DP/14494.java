import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] fld = new int[1001][1001];
		
		for(int i = 1; i <= n; i++) {
			fld[i][1] = 1;
		}
		
		for(int j = 1; j <= m; j++) {
			fld[1][j] = 1;
		}
		
		for(int i = 2; i <= n; i++) {
			for(int j = 2; j <= m; j++) {
				fld[i][j] = fld[i - 1][j] + fld[i][j - 1];
				fld[i][j] %= 1000000007;
				fld[i][j] += fld[i - 1][j - 1];
				fld[i][j] %= 1000000007;
			}
		}
		
		System.out.println(fld[n][m]);
	}
}