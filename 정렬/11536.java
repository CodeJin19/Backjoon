import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		String givenList[] = new String[N];
		String sortList[] = new String[N];

		for (int i = 0; i < N; i++) {
			givenList[i] = reader.readLine();
			sortList[i] = givenList[i];
		}

		Arrays.sort(sortList);

		boolean increasing = true;
		boolean decreasing = true;

		for (int i = 0; i < N; i++) {
			if (givenList[i].compareTo(sortList[i]) != 0) {
				increasing = false;
				break;
			}
		}

		if (increasing) {
			System.out.println("INCREASING");
		} else {
			for (int i = 0; i < N; i++) {
				if (givenList[i].compareTo(sortList[N - 1 - i]) != 0) {
					decreasing = false;
					break;
				}
			}

			if (decreasing) {
				System.out.println("DECREASING");
			} else {
				System.out.println("NEITHER");
			}
		}
	}
}
