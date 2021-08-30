import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		int num = 1;

		while (0 < N) {
			int diff = (int) Math.log10(num++) + 1;

			if (diff < N)
				N -= diff;
			else
				break;
		}

		String str = Integer.toString(--num);

		System.out.println(str.charAt(N - 1));
	}
}
