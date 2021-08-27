import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		boolean isOff[] = new boolean[N + 1];

		int t = Integer.parseInt(reader.readLine());
		int max = 0;

		for (int itr = 0; itr < t; itr++) {
			int k = Integer.parseInt(reader.readLine());
			int x = k;
			int cnt = 0;

			for (int i = 1; i < N + 1; i++) {
				if (i == x) {
					isOff[i] = !isOff[i];
					x += k;
				}

				if (isOff[i])
					cnt++;
			}

			max = Math.max(max, cnt);
		}

		System.out.println(max);
	}
}
