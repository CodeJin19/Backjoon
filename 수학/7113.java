import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int cnt = 0;

		if (n == m) {
			cnt = 1;
		} else {
			cnt = 0;

			while (n != 1 && m != 1) {
				if (n < m) {
					m -= n;
					cnt++;
				} else if (m < n) {
					n -= m;
					cnt++;
				} else if (n == m) {
					cnt++;
					break;
				}
			}

			if (n != 1 && m == 1)
				cnt += n;
			else if (n == 1 && m != 1)
				cnt += m;
		}

		System.out.println(cnt);
	}
}
