import java.io.*;
import java.util.*;

public class Main {
	static class Name implements Comparable<Name> {
		public String str;
		public int sum;

		Name(String input) {
			str = input;
			sum = 0;

			int len = str.length();

			for (int i = 0; i < len; i++)
				if ('0' <= str.charAt(i) && str.charAt(i) <= '9')
					sum += (int) (str.charAt(i) - '0');
		}

		@Override
		public int compareTo(Name o) {
			if (this.str.length() == o.str.length()) {
				if (this.sum == o.sum) {
					return this.str.compareTo(o.str);
				} else {
					return this.sum - o.sum;
				}
			} else {
				return this.str.length() - o.str.length();
			}
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Name[] list = new Name[n];

		for (int i = 0; i < n; i++)
			list[i] = new Name(reader.readLine());

		Arrays.sort(list);

		for (int i = 0; i < n; i++)
			System.out.println(list[i].str);
	}
}
