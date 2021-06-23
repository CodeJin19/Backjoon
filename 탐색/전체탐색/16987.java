import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static class egg {
		int weight;
		int durability;

		public egg(int durability, int weight) {
			super();
			this.weight = weight;
			this.durability = durability;
		}
	}

	static int destroy(egg list[], int now) {
		if (now == list.length) {
			int cnt = 0;

			for (int i = 0; i < list.length; i++)
				if (list[i].durability <= 0)
					cnt++;

			return cnt;
		}

		int ret = 0;

		if (list[now].durability <= 0) {
			ret = destroy(list, now + 1);
		} else {
			boolean flag = false;

			for (int i = 0; i < list.length; i++) {
				if (i != now && 0 < list[i].durability) {
					list[now].durability -= list[i].weight;
					list[i].durability -= list[now].weight;

					ret = Math.max(ret, destroy(list, now + 1));
					flag = true;

					list[now].durability += list[i].weight;
					list[i].durability += list[now].weight;
				}
			}

			if (!flag) {
				ret = destroy(list, now + 1);
			}
		}

		return ret;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(reader.readLine());
		egg list[] = new egg[n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());
			list[i] = new egg(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}

		System.out.println(destroy(list, 0));
	}
}
