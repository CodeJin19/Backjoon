import java.io.*;
import java.util.*;

import sun.java2d.loops.ScaledBlit;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> deck = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		for (int i = 0; i < m; i++)
			deck.offerLast(i);

		String str = st.nextToken();
		int len = str.length() - 1;

		for (int i = 0; i < len; i++) {

			if (str.charAt(i) == 'A') {
				deck.offerLast(deck.pollFirst());
			} else {
				int top = deck.pollFirst();
				int target = deck.pollFirst();
				deck.offerFirst(top);
				deck.offerLast(target);
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n - 1; i++) {
			deck.pollFirst();
		}

		sb.append(deck.pollFirst()).append(" ").append(deck.pollFirst()).append(" ").append(deck.pollFirst());

		System.out.println(sb);

	}
}
