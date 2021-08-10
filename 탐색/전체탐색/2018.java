import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());
		int cnt = 0;

		for (int a = 1; a <= num; a++) {
			int sum = a;
			int b = a;

			while (sum < num)
				sum += (++b);

			if (sum == num)
				cnt++;
		}

		System.out.println(cnt);
	}
}
