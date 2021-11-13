import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		if (n < 2) {
			System.out.println(1);
		} else {
			int pp = 1;
			int p = 1;
			int now = 0;

			for (int i = 2; i <= n; i++) {
				now = 1 + p + pp;
				now %= 1000000007;
                
				pp = p;
				p = now;
			}

			System.out.println(now);
		}
	}
}
