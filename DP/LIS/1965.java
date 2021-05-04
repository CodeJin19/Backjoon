import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static int list[];
	static int cache[];

	static int getCache(int idx) {
		if (cache[idx] != 0)
			return cache[idx];

		int ret = 1;

		for (int i = idx + 1; i < list.length; i++)
			if(list[idx] < list[i])
				ret = Math.max(ret, getCache(i) + 1);

		cache[idx] = ret;
		return ret;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(reader.readLine());

		list = new int[n + 1];
		cache = new int[n + 1];

		st = new StringTokenizer(reader.readLine());

		for (int i = 1; i <= n; i++)
			list[i] = Integer.parseInt(st.nextToken());

		System.out.println(getCache(0) - 1);
	}
}
