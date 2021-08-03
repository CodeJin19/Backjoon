import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		int t = Integer.parseInt(reader.readLine());
		ArrayList<Integer> vertical = new ArrayList<>();
		ArrayList<Integer> horizontal = new ArrayList<>();

		vertical.add(0);
		vertical.add(h);

		horizontal.add(0);
		horizontal.add(w);

		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(reader.readLine());

			if (Integer.parseInt(st.nextToken()) == 0)
				vertical.add(Integer.parseInt(st.nextToken()));
			else
				horizontal.add(Integer.parseInt(st.nextToken()));
		}

		Collections.sort(horizontal);
		Collections.sort(vertical);

		int from = 0;
		int to = w;
		int x = Integer.MIN_VALUE;
		int len = horizontal.size();

		for (int i = 1; i < len; i++) {
			to = horizontal.get(i);
			x = Math.max(x, (to - from));
			from = to;
		}

		from = 0;
		to = h;
		int y = Integer.MIN_VALUE;
		len = vertical.size();

		for (int i = 1; i < len; i++) {
			to = vertical.get(i);
			y = Math.max(y, (to - from));
			from = to;
		}

		System.out.println(y * x);
	}
}
