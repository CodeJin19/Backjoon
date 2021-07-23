import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int aLen = Integer.parseInt(st.nextToken());
		int bLen = Integer.parseInt(st.nextToken());
		int cnt[] = { 3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1 };
		ArrayList<Integer> list = new ArrayList<Integer>();

		st = new StringTokenizer(reader.readLine());
		String a = st.nextToken();
		String b = st.nextToken();

		int aIdx = 0;
		int bIdx = 0;

		while (aIdx < aLen || bIdx < bLen) {
			if (aIdx < aLen)
				list.add(cnt[(a.charAt(aIdx++) - 'A')]);

			if (bIdx < bLen)
				list.add(cnt[(b.charAt(bIdx++) - 'A')]);
		}

		for (int i = 1; i <= aLen + bLen - 2; i++) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();

			for (int j = 0; j < aLen + bLen - i; j++) {
				int val = list.get(j) + list.get(j + 1);
				val %= 10;
				tmp.add(val);
			}

			list = tmp;
		}

		int ans = list.get(0) * 10 + list.get(1);
		System.out.println(ans + "%");
	}
}
