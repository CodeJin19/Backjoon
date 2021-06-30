import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		double a, b;
		double score = 0;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			st.nextToken();

			b = Double.parseDouble(st.nextToken());

			String tmp = st.nextToken();

			if (tmp.charAt(0) == 'A')
				a = 4;
			else if (tmp.charAt(0) == 'B')
				a = 3;
			else if (tmp.charAt(0) == 'C')
				a = 2;
			else if (tmp.charAt(0) == 'D')
				a = 1;
			else
				a = 0;

			if (tmp.length() == 2) {
				if (tmp.charAt(1) == '+')
					a += 0.3;
				else if (tmp.charAt(1) == '-')
					a -= 0.3;
			}

			score += (a * b);
			sum += b;
		}

		score /= sum;
		System.out.println(String.format("%.2f", score));
	}
}
