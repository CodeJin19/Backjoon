import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		int pos[] = new int[11];

		for (int i = 0; i < 11; i++)
			pos[i] = -1;

		int cnt = 0;

		for (int itr = 0; itr < T; itr++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int num = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());

			if (pos[num] == -1) {
				pos[num] = p;
			} else if (pos[num] != p) {
				pos[num] = p;
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}
