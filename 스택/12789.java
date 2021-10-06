import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Stack<Integer> stck = new Stack<>();
		int nextNum = 1;

		StringTokenizer st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());

			if (nextNum == num) {
				nextNum++;

				while (!stck.isEmpty() && nextNum == stck.peek()) {
					stck.pop();
					nextNum++;
				}
			} else {
				stck.push(num);
			}
		}

		boolean isPossible = true;

		while (isPossible && !stck.isEmpty()) {
			int num = stck.pop();

			if (nextNum == num)
				nextNum++;
			else
				isPossible = false;
		}

		if (isPossible)
			System.out.println("Nice");
		else
			System.out.println("Sad");
	}
}
