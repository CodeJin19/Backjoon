import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		boolean flag = true;

		if ((r + c) % 2 == 0)
			flag = true;
		else
			flag = false;

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			if (flag) {
				boolean semiflag = true;

				for (int j = 0; j < n; j++) {
					if (semiflag) {
						sb.append("v");
						semiflag = false;
					} else {
						sb.append(".");
						semiflag = true;
					}
				}

				flag = false;
			} else {
				boolean semiflag = false;

				for (int j = 0; j < n; j++) {
					if (semiflag) {
						sb.append("v");
						semiflag = false;
					} else {
						sb.append(".");
						semiflag = true;
					}
				}

				flag = true;
			}

			sb.append("\n");
		}

		System.out.println(sb);
	}
}
