import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int total = Integer.parseInt(reader.readLine());
		int num;

		str = reader.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		Stack<int[]> stck = new Stack<int[]>();
		StringBuilder sb = new StringBuilder();

		num = Integer.parseInt(st.nextToken());
		sb.append("0");

		stck.push(new int[] { num, 1 });

		for (int i = 2; i <= total; i++) {
			num = Integer.parseInt(st.nextToken());

			if (stck.peek()[0] < num) {
				while (!stck.isEmpty() && stck.peek()[0] < num)
					stck.pop();

				if (stck.isEmpty())
					sb.append(" ").append("0");
				else
					sb.append(" ").append(stck.peek()[1]);

			} else {
				sb.append(" ").append(stck.peek()[1]);
			}

			stck.push(new int[] { num, i });
		}

		System.out.println(sb);
	}
}
