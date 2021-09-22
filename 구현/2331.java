import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int a = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());

		ArrayList<Integer> list = new ArrayList<>();

		list.add(a);
		int prev = a;
		int idx = 0;
		boolean flag = true;

		while (flag) {
			int sum = 0;

			while (prev != 0) {
				int r = prev % 10;
				prev /= 10;
				sum += Math.pow(r, p);
			}

			prev = sum;

			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) == sum) {
					idx = i;
					flag = false;
					break;
				}
			}

			if (flag)
				list.add(sum);
		}

		System.out.println(idx);
	}
}
