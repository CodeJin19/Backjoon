import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());
		int set[] = { 1, 1, 1, 1, 1, 1, 2, 1, 1 };
		int left[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int cnt = 0;
        
        if(num == 0)
            cnt++;

		while (num != 0) {
			int d = num % 10;
			num /= 10;

			if (d == 6 || d == 9) {
				if (left[6] == 0) {
					for (int i = 0; i < 9; i++)
						left[i] += set[i];

					cnt++;
				}

				left[6]--;
			} else {
				if (left[d] == 0) {
					for (int i = 0; i < 9; i++)
						left[i] += set[i];

					cnt++;
				}

				left[d]--;
			}
		}

		System.out.println(cnt);
	}
}
