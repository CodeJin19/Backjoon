import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();

		for (int itr = 1; itr <= T; itr++) {
			int N = Integer.parseInt(reader.readLine());

			if (N == 0) {
				sb.append("Case #").append(itr).append(": INSOMNIA\n");
			} else {
				boolean isUsed[] = new boolean[10];
				int chckSum = 10;
				int idx = 1;

				while (chckSum != 0) {
					int dup = N * (idx++);

					while (dup != 0) {
						int r = dup % 10;
						dup /= 10;

						if (!isUsed[r]) {
							isUsed[r] = true;
							chckSum--;
						}
					}
				}

				sb.append("Case #").append(itr).append(": ").append(N * (--idx)).append("\n");
			}
		}

		System.out.print(sb);
	}
}
