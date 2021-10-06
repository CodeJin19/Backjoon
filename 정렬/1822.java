import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int aLen = Integer.parseInt(st.nextToken());
		int bLen = Integer.parseInt(st.nextToken());

		int[] arr = new int[aLen];
		int[] brr = new int[bLen];

		st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < aLen; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < bLen; i++)
			brr[i] = Integer.parseInt(st.nextToken());

		Arrays.sort(arr);
		Arrays.sort(brr);

		int adx = 0;
		int bdx = 0;

		ArrayList<Integer> ans = new ArrayList<>();

		while (adx < aLen && bdx < bLen) {
			if (arr[adx] == brr[bdx]) {
				adx++;
				bdx++;
			} else if (arr[adx] < brr[bdx]) {
				ans.add(arr[adx]);
				adx++;
			} else {
				bdx++;
			}
		}

		while (adx < aLen)
			ans.add(arr[adx++]);

		StringBuilder sb = new StringBuilder();
		sb.append(ans.size()).append("\n");

		if (ans.size() != 0) {
			sb.append(ans.get(0));

			for (int i = 1; i < ans.size(); i++)
				sb.append(" ").append(ans.get(i));
		}

		System.out.println(sb);

	}
}
