import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		StringBuilder sb = new StringBuilder();
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(reader.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(reader.readLine());

		y += t;
		y %= (h * 2);
		if (h < y)
			y = (h * 2) - y;

		x += t;
		x %= (w * 2);
		if (w < x)
			x = (w * 2) - x;

		sb.append(x).append(" ").append(y);
		System.out.println(sb);

	}
}
