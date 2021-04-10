import java.io.*;

public class Main {

	public static int d[][] = { {0, 0}, { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 }, { -1, -1 }, { -1, 0 }, { -1, 1 } };

	public static boolean boxMove(int y, int x, char fld[][], int cnt) {
		char newFld[][] = new char[8][8];
		
		for(int i = 0; i < 8; i++)
			newFld[0][i] = '.';
		
		for(int i = 0; i < 7; i++)
			for(int j = 0; j < 8; j++)
				newFld[i + 1][j] = fld[i][j];
		
		if(newFld[y][x] != '.')
			return false;
		
		return ookjeMove(y, x, newFld, cnt);
	}
	
	public static boolean ookjeMove(int y, int x, char fld[][], int cnt) {
		if (cnt == 8)
			return true;

		for (int i = 0; i < 9; i++) {
			int ny = y + d[i][0];
			int nx = x + d[i][1];

			if (0 <= ny && ny < 8 && 0 <= nx && nx < 8 && fld[ny][nx] == '.') {
				if (boxMove(ny, nx, fld, cnt + 1))
					return true;
			}
		}

		return false;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str;
		char fld[][] = new char[8][8];

		for (int i = 0; i < 8; i++) {
			str = reader.readLine();

			for (int j = 0; j < 8; j++)
				fld[i][j] = str.charAt(j);
		}

		if (ookjeMove(7, 0, fld, 0))
			System.out.println(1);
		else
			System.out.println(0);
	}
}
