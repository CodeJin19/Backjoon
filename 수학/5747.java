import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int xEven, xOdd, yEven, yOdd;

		while (N != 0) {
			xEven = 0;
			xOdd = 0;
			yEven = 0;
			yOdd = 0;

			st = new StringTokenizer(reader.readLine());

			for (int i = 0; i < N; i++)
				if (Integer.parseInt(st.nextToken()) % 2 == 0)
					xEven++;
				else
					xOdd++;

			st = new StringTokenizer(reader.readLine());

			for (int i = 0; i < N; i++)
				if (Integer.parseInt(st.nextToken()) % 2 == 0)
					yEven++;
				else
					yOdd++;

			if (xEven == yOdd)
				sb.append(0);
			else if (xEven < yOdd)
				sb.append(yOdd - xEven);
			else
				sb.append(xEven - yOdd);

			sb.append("\n");

			N = Integer.parseInt(reader.readLine());
		}

		System.out.print(sb);
	}
}
