import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		boolean isUsed[];
		int n, k, cur = 0, cnt, idx;

		str = reader.readLine();
		n = Integer.parseInt(str.split(" ")[0]);
		k = Integer.parseInt(str.split(" ")[1]);
		isUsed = new boolean[n + 1];

		for (int i = 0; i < n + 1; i++)
			isUsed[i] = false;

		cur = k;
		isUsed[cur] = true;
		sb.append("<");
		sb.append(cur);
		idx = 1;

		while (idx != n) {
			cnt = 0;

			while (cnt != k) {
				cur++;
				if (n < cur)
					cur -= n;
				
				if(!isUsed[cur])
					cnt++;
			}
			
			isUsed[cur] = true;
			sb.append(", ").append(cur);
			idx++;
		}
		sb.append(">");

		System.out.println(sb);
	}
}
