import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		double[] list = new double[n];

		for (int i = 0; i < n; i++)
			list[i] = Integer.parseInt(reader.readLine());

		Arrays.sort(list);

		for (int i = 1; i < n; i++) {
			double tmp = list[i] + list[i - 1];
			tmp /= 2;
			list[i] = tmp;
		}

		System.out.printf("%.6f", list[n - 1]);
	}
}
