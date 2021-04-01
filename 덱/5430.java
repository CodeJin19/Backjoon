import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		String order, str;
		int T = Integer.parseInt(reader.readLine());
		int n, idx, num, head, tail, list[];
		boolean isHead, isError;

		for (int itr = 0; itr < T; itr++) {
			sb = new StringBuilder();
			order = reader.readLine();
			n = Integer.parseInt(reader.readLine());
			str = reader.readLine();
			list = new int[n];
			head = 0;
			tail = n - 1;
			idx = 1;
			isHead = true;
			isError = false;

			for (int i = 0; i < n; i++) {
				num = 0;

				while (str.charAt(idx) != ',' && str.charAt(idx) != ']') {
					num *= 10;
					num += (int) (str.charAt(idx) - '0');
					idx++;
				}

				list[i] = num;
				idx++;
			}

			for (int i = 0; i < order.length(); i++) {
				if (order.charAt(i) == 'R') {
					isHead = !isHead;
				} else {
					if (tail < head) {
						isError = true;
						break;
					}
					if (isHead) {
						head++;
					} else {
						tail--;
					}
				}
			}

			if (tail < head) {
				if (isError)
					sb.append("error");
				else
					sb.append("[]");
			} else if (isHead) {
				sb.append("[").append(list[head]);
				for (int i = head + 1; i <= tail; i++) {
					sb.append(",").append(list[i]);
				}
				sb.append("]");
			} else {
				sb.append("[").append(list[tail]);
				for (int i = tail - 1; head <= i; i--) {
					sb.append(",").append(list[i]);
				}
				sb.append("]");
			}

			System.out.println(sb);
		}
	}
}
