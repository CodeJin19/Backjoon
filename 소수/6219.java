import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		boolean isPrime[] = new boolean[B + 1];

		for (int i = 2; i <= B; i++)
			isPrime[i] = true;

		for (int i = 2; i <= B; i++)
			for (int j = i + i; j <= B; j += i)
				isPrime[j] = false;

		int cnt = 0;

		for (int i = A; i <= B; i++) {
			if (isPrime[i]) {
				int dup = i;
				boolean flag = false;

				while (dup != 0) {
					int r = dup % 10;
					dup /= 10;

					if (r == D) {
						flag = true;
						break;
					}
				}

				if (flag)
					cnt++;
			}
		}

		System.out.println(cnt);
	}
}
