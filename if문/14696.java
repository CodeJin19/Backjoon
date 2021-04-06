import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(str);
		int a[][] = new int[N][4];
		int b[][] = new int[N][4];
		int n, x;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(reader.readLine());
			n = Integer.parseInt(st.nextToken());

			for (int j = 0; j < n; j++)
				a[i][Integer.parseInt(st.nextToken()) - 1]++;
			
			st = new StringTokenizer(reader.readLine());
			n = Integer.parseInt(st.nextToken());

			for (int j = 0; j < n; j++)
				b[i][Integer.parseInt(st.nextToken()) - 1]++;
		}

		for (int i = 0; i < N; i++) {
			if (a[i][3] < b[i][3])
				sb.append("B").append("\n");
			else if (b[i][3] < a[i][3])
				sb.append("A").append("\n");
			else if (a[i][2] < b[i][2])
				sb.append("B").append("\n");
			else if (b[i][2] < a[i][2])
				sb.append("A").append("\n");
			else if (a[i][1] < b[i][1])
				sb.append("B").append("\n");
			else if (b[i][1] < a[i][1])
				sb.append("A").append("\n");
			else if (a[i][0] < b[i][0])
				sb.append("B").append("\n");
			else if (b[i][0] < a[i][0])
				sb.append("A").append("\n");
			else
				sb.append("D").append("\n");
		}

		System.out.print(sb);
	}
}
