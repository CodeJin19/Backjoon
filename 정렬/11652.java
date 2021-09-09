import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		long list[] = new long[n];

		for (int i = 0; i < n; i++)
			list[i] = Long.parseLong(reader.readLine());

		Arrays.sort(list);

		long num = list[0];
		long ans = num;
		int cnt = 1;
		int max = 0;

		for (int i = 1; i < n; i++) {
			if (list[i] == num) {
				cnt++;
			} else {
				if (max < cnt) {
					max = cnt;
					ans = num;
				}

				num = list[i];
				cnt = 1;
			}
		}

		if (max < cnt)
			ans = num;

		System.out.println(ans);
	}
}
