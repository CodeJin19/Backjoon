import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		char[][] fld = new char[n][m];
		char[][] ans = new char[n][m];

		for (int i = 0; i < n; i++) {
			String str = reader.readLine();

			for (int j = 0; j < m; j++)
				fld[i][j] = str.charAt(j);
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(fld[i][j] == '#') {
					ans[i][j] = '#';
				} else {
					boolean isPossible = true;
					
					if(0 <= i - 1 && ans[i - 1][j] == 'E')
						isPossible = false;
					else if(0 <= j - 1 && ans[i][j - 1] == 'E')
						isPossible = false;
					
					if(isPossible)
						ans[i][j] = 'E';
					else
						ans[i][j] = '.';
				}
				
				sb.append(ans[i][j]);
			}
			
			sb.append("\n");
		}

		System.out.print(sb);
	}
}
