import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int list[] = new int[5];
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < 5; i++)
			list[i] = Integer.parseInt(st.nextToken());

		for(int i = 0; i < 5; i++) {
			int num = list[i];
			int cnt = 0;
			
			while (true) {
				cnt = 0;

				for (int j = 0; j < 5; j++)
					if (num % list[j] == 0)
						cnt++;

				if (3 <= cnt)
					break;

				num += list[i];
			}
			
			min = Math.min(min, num);
		}

		System.out.println(min);
	}
}
