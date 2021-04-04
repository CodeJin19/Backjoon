import java.io.*;

public class Main {
	private static int list[];
	private static int cache[];

	public static boolean solve(int toSelect, int startIdx) {
		if (toSelect == 7) {
			int sum = 0;

			for (int i = 0; i < 7; i++) {
				sum += cache[i];
			}

			if (sum == 100)
				return true;
			else
				return false;
		}

		for (int i = startIdx; i < 9; i++) {
			cache[toSelect] = list[i];
			if (solve(toSelect + 1, i + 1))
				return true;
		}

		return false;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		list = new int[9];
		cache = new int[7];

		for (int i = 0; i < 9; i++)
			list[i] = Integer.parseInt(reader.readLine());

		solve(0, 0);

		for (int i = 0; i < 7; i++)
			System.out.println(cache[i]);
	}
}
