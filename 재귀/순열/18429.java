import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static int[] list;

	static int solve(int toSelect, int total, boolean[] cache, boolean flag) {
		if (toSelect == list.length)
			if (flag)
				return 1;
			else
				return 0;

		int ret = 0;

		for (int i = 0; i < list.length; i++) {
			if (!cache[i]) {
				cache[i] = true;

				if (total + list[i]< 0)
					ret += solve(toSelect + 1, total + list[i], cache, false);
				else
					ret += solve(toSelect + 1, total + list[i], cache, flag);
                
				cache[i] = false;	
			}
		}

		return ret;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n, k;
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		list = new int[n];

		st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < n; i++)
			list[i] = Integer.parseInt(st.nextToken()) - k;

		System.out.println(solve(0, 0, new boolean[n], true));
	}
}
