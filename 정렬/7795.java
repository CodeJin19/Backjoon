import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine());

		for (int itr = 0; itr < t; itr++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());

			int aLen = Integer.parseInt(st.nextToken());
			int bLen = Integer.parseInt(st.nextToken());

			int[] arr = new int[aLen];
			int[] brr = new int[bLen];

			st = new StringTokenizer(reader.readLine());

			for (int i = 0; i < aLen; i++)
				arr[i] = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(reader.readLine());

			for (int i = 0; i < bLen; i++)
				brr[i] = Integer.parseInt(st.nextToken());

			Arrays.sort(arr);
			Arrays.sort(brr);

			int total = 0;
			int prev = -1;
			int cnt = 0;
			int b = 0;

			for (int a = 0; a < aLen; a++) {
				if (prev == arr[a]) {
					total += cnt;
				} else if (b < bLen) {
					while (b < bLen && brr[b] < arr[a]) {
						b++;
						cnt++;
					}

					prev = arr[a];
					total += cnt;
				} else {
					total += cnt;
				}
			}

			System.out.println(total);
		}
	}
}
