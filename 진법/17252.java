import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		if (n == 0)
			System.out.println("NO");
        else if (check(n))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	static boolean check(int num) {
		while (num != 0) {
			int r = num % 3;

			if (r == 2)
				return false;

			num /= 3;
		}

		return true;
	}
}
