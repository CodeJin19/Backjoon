import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		int[] list = new int[n];
		StringTokenizer st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < n; i++)
			list[i] = Integer.parseInt(st.nextToken());

		int ans = 1;
		int ascCnt = 1;
		int descCnt = 1;
		int prev = list[0];

		for (int i = 1; i < n; i++) {
			if (prev <= list[i]) {
				ascCnt++;
			} else {
				ans = Math.max(ans, ascCnt);
				ascCnt = 1;
			}

			if (list[i] <= prev) {
				descCnt++;
			} else {
				ans = Math.max(ans, descCnt);
				descCnt = 1;
			}

			prev = list[i];
		}

		ans = Math.max(ans, ascCnt);
		ans = Math.max(ans, descCnt);

		System.out.println(ans);
	}
}
