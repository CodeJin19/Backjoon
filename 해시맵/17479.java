import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		StringTokenizer stTmp;

		HashMap<String, Integer> menuA = new HashMap<>();
		HashMap<String, Integer> menuB = new HashMap<>();

		int num = Integer.parseInt(st.nextToken());

		for (int i = 0; i < num; i++) {
			stTmp = new StringTokenizer(reader.readLine());

			String menu = stTmp.nextToken();
			int price = Integer.parseInt(stTmp.nextToken());

			menuA.put(menu, price);
		}

		num = Integer.parseInt(st.nextToken());

		for (int i = 0; i < num; i++) {
			stTmp = new StringTokenizer(reader.readLine());

			String menu = stTmp.nextToken();
			int price = Integer.parseInt(stTmp.nextToken());

			menuB.put(menu, price);
		}

		num = Integer.parseInt(st.nextToken());

		for (int i = 0; i < num; i++) {
			String menu = reader.readLine();
		}

		num = Integer.parseInt(reader.readLine());
		long[] subTotal = new long[2];
		int cnt = 0;

		for (int i = 0; i < num; i++) {
			String menu = reader.readLine();
			int price = menuA.getOrDefault(menu, -1);

			if (0 < price) {
				subTotal[0] += price;
				continue;
			}

			price = menuB.getOrDefault(menu, -1);

			if (0 < price) {
				subTotal[1] += price;
				continue;
			}

			cnt++;
		}

		boolean flag = true;

		if (0 < subTotal[1] && subTotal[0] < 20000)
			flag = false;
		else if (0 < cnt && subTotal[0] + subTotal[1] < 50000)
			flag = false;
		else if (1 < cnt)	
			flag = false;

		if (flag)
			System.out.println("Okay");
		else
			System.out.println("No");
	}
}
