import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		long fp = 1;
		long fpp = 1;
		long fppp = 1;
		long fn = 0;

		if (n <= 3) {
			System.out.println(1);
		} else {
			for (int i = 4; i <= n; i++) {
				fn = fp + fppp;
				fppp = fpp;
				fpp = fp;
				fp = fn;
			}

			System.out.println(fn);
		}
	}
}
