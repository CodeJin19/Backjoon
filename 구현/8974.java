import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int list[] = new int[b + 1];
		int idx = 1;
		int num = 1;
		int cnt = 0;
		int sum = 0;

		while (idx <= b) {
			if (cnt < num) {
				list[idx++] = num;
				cnt++;
			} else {
				num++;
				cnt = 0;
			}
		}

		for (int i = a; i <= b; i++)
			sum += list[i];

		System.out.println(sum);
	}
}
