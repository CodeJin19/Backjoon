import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		int y = 2019;
		int m = 1;
		int d = 0; // 20190113는 일요일
		int cnt = 0;

		while (y <= N) {
            d %= 7;
			
			if (d == 5)
				cnt++;
            
			switch (m) {
			case 2:
				if (y % 400 == 0)
					d += 29;
				else if (y % 100 == 0)
					d += 28;
				else if (y % 100 != 0 && y % 4 == 0)
					d += 29;
				else
					d += 28;
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				d += 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				d += 30;
				break;
			}

			if (++m == 13) {
				y++;
				m = 1;
			}
		}

		System.out.println(cnt);
	}
}
