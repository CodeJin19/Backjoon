import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int D = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int list[] = new int[D];
		int depth = D;

		st = new StringTokenizer(reader.readLine());

		list[0] = Integer.parseInt(st.nextToken());

		for (int i = 1; i < D; i++) {
			int origin = Integer.parseInt(st.nextToken());
			list[i] = Math.min(list[i - 1], origin);
		}

		st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < N; i++) {
			int r = Integer.parseInt(st.nextToken());

			if (depth == 0) {
				depth = -1;
				break;
			} else if (r <= list[depth - 1]) {
				depth--;
			} else if(list[0] < r) {
				depth = -1;
                break;
			} else {
				int from = 0;
				int to = depth - 1;
				boolean flag = false;

				while (from <= to) {
					int mid = (from + to) / 2;

					if (list[mid] == r) {
						while (mid < depth && list[mid] == r)
							mid++;

						depth = mid - 1;
						flag = true;
						break;
					} else if(r < list[mid]) {
						from = mid + 1;
					} else {
						to = mid - 1;
					}
				}
				
				if(!flag) {
					while(list[from] < r)
						from--;
					
					depth = from;
				}
			}
		}

		System.out.println(depth + 1);
	}
}
