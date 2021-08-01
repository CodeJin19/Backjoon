import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int price = Integer.parseInt(reader.readLine());
		int ans;

		if (price == 1) {
			ans = -1;
		} else if (price == 2) {
			ans = 1;
		} else if (price == 3) {
			ans = -1;
		} else if (price == 4) {
			ans = 2;
		} else if (price == 5) {
			ans = 1;
		} else {
			int n = price / 5;
			int r = price % 5;
			ans = 0;

			switch (r) {
			case 0:
				ans = n;
				break;
			case 1:
				ans = n - 1 + 3;
				break;
			case 2:
				ans = n + 1;
				break;
			case 3:
				ans = n - 1 + 4;
				break;
			case 4:
				ans = n + 2;
				break;
			}
		}

		System.out.println(ans);
	}
}
