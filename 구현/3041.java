import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int from[][] = { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 0, 3 }, { 1, 0 }, { 1, 1 }, { 1, 2 }, { 1, 3 }, { 2, 0 },
				{ 2, 1 }, { 2, 2 }, { 2, 3 }, { 3, 0 }, { 3, 1 }, { 3, 2 } };

		int sum = 0;

		for (int i = 0; i < 4; i++) {
			String str = reader.readLine();

			for (int j = 0; j < 4; j++) {
				int y = i;
				int x = j;

				if (str.charAt(j) == '.')
					continue;

				sum += Math.abs(y - from[(int) (str.charAt(j) - 'A')][0])
						+ Math.abs(x - from[(int) (str.charAt(j) - 'A')][1]);
			}
		}

		System.out.println(sum);
	}
}
