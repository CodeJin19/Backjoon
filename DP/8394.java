import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		if (n == 1) {
			System.out.println(0);
		} else if (n == 2) {
			System.out.println(2);
		} else {
			int num = 2;
			int onPrev = 1;
			int offPrev = 1;
			int on = 0;
			int off = 0;

			while (num != n) {
				on = offPrev;
				off = onPrev + offPrev;

				offPrev = off % 10;
				onPrev = on % 10;

				num++;
			}

			System.out.println((on + off) % 10);
		}
	}
}
