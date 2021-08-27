import java.io.*;
import java.util.*;

public class Main {
	static int getDist(char from, char to) {
		if (from == 'H') {
			if (to == 'H')
				return 0;
			if (to == 'P')
				return 103;
			if (to == 'S')
				return 329;
			if (to == 'K')
				return 466;
			if (to == 'T')
				return 148;
		}
		if (from == 'P') {
			if (to == 'H')
				return 103;
			if (to == 'P')
				return 0;
			if (to == 'S')
				return 408;
			if (to == 'K')
				return 577;
			if (to == 'T')
				return 260;
		}
		if (from == 'S') {
			if (to == 'H')
				return 329;
			if (to == 'P')
				return 408;
			if (to == 'S')
				return 0;
			if (to == 'K')
				return 287;
			if (to == 'T')
				return 226;
		}
		if (from == 'K') {
			if (to == 'H')
				return 466;
			if (to == 'P')
				return 577;
			if (to == 'S')
				return 287;
			if (to == 'K')
				return 0;
			if (to == 'T')
				return 312;
		}
		if (from == 'T') {
			if (to == 'H')
				return 148;
			if (to == 'P')
				return 260;
			if (to == 'S')
				return 226;
			if (to == 'K')
				return 312;
			if (to == 'T')
				return 0;
		}
		return 0;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();

		for (int itr = 1; itr <= T; itr++) {
			String str = reader.readLine();
			str += "H";

			int len = str.length();
			char from = 'H';
			int dist = 0;

			for (int i = 0; i < len; i++) {
				char to = str.charAt(i);
				dist += getDist(from, to);
				from = to;
			}

			sb.append("Case ").append(itr).append(": ").append(dist).append("\n");
		}

		System.out.print(sb);
	}
}
