import java.io.*;

public class Main {

	static int d[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		StringBuilder sb = new StringBuilder();
		int R = Integer.parseInt(str.split(" ")[0]);
		int C = Integer.parseInt(str.split(" ")[1]);
		int N = Integer.parseInt(str.split(" ")[2]);
		char fld1[][] = new char[R][C];
		char fld2[][] = new char[R][C];
		char fld3[][] = new char[R][C];

		for (int i = 0; i < R; i++) {
			str = reader.readLine();

			for (int j = 0; j < C; j++) {
				fld1[i][j] = str.charAt(j);
				fld2[i][j] = 'O';
				fld3[i][j] = 'O';
			}
		}
		
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (fld1[i][j] == 'O') {
					for(int k = 0; k < 4; k++) {
						if(0 <= i + d[k][0] && i + d[k][0] < R && 0 <= j + d[k][1] && j + d[k][1] < C) {
							fld2[i + d[k][0]][j + d[k][1]] = '.';
						}
					}
					
					fld2[i][j] = '.';
				}
			}
		}
		
		for(int i = 0; i < R; i++) {
			for(int j = 0; j < C; j++) {
				if (fld2[i][j] == 'O') {
					for(int k = 0; k < 4; k++) {
						if(0 <= i + d[k][0] && i + d[k][0] < R && 0 <= j + d[k][1] && j + d[k][1] < C) {
							fld3[i + d[k][0]][j + d[k][1]] = '.';
						}
					}
					
					fld3[i][j] = '.';
				}
			}
		}
	
		if (N % 2 == 0) {
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++)
					sb.append("O");
				sb.append("\n");
			}
		} else if (N == 1) {
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++)
					sb.append(fld1[i][j]);
				sb.append("\n");
			}
		} else if (N % 4 == 3) {
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++)
					sb.append(fld2[i][j]);
				sb.append("\n");
			}
		} else if (N % 4 == 1) {
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++)
					sb.append(fld3[i][j]);
				sb.append("\n");
			}
		}
		
		System.out.print(sb);
	}
}
