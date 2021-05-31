import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		ArrayList<Integer> list[];
		int len[];
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int l, ans = 0;
		list = new ArrayList[m];
		len = new int[m];
		boolean people[] = new boolean[n + 1];
		boolean isTrueParty[] = new boolean[m];
		boolean flag;

		st = new StringTokenizer(reader.readLine());
		l = Integer.parseInt(st.nextToken());

		for (int i = 0; i < l; i++)
			people[Integer.parseInt(st.nextToken())] = true;

		for (int i = 0; i < m; i++) {
			list[i] = new ArrayList<Integer>();

			st = new StringTokenizer(reader.readLine());
			len[i] = Integer.parseInt(st.nextToken());

			for (int j = 0; j < len[i]; j++)
				list[i].add(Integer.parseInt(st.nextToken()));
		}

		do {
			flag = false;

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < len[i]; j++) {
					if (people[list[i].get(j)]) {
						for(int k = 0; k < len[i]; k++) {
							people[list[i].get(k)] = true;
						}
						
						if(!isTrueParty[i]) {
							isTrueParty[i] = true;
							flag = true;
						}
						
						break;
					}
				}
			}

		} while (flag);

		for (int i = 0; i < m; i++)
			if (!isTrueParty[i])
				ans++;

		System.out.println(ans);
	}
}
