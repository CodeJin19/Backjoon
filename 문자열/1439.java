import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int zeros = 0;
		int ones = 0;

		String S = reader.readLine();
		int len = S.length();
		char tmp = S.charAt(0);

		for (int i = 1; i < len; i++) {
			if (tmp != S.charAt(i)) {
				if (tmp == '0') {
					zeros++;
					tmp = '1';
				} else {
					ones++;
					tmp = '0';
				}
			}
		}

		if (tmp == '0')
			zeros++;
		else
			ones++;

		System.out.println(zeros < ones ? zeros : ones);
	}
}
