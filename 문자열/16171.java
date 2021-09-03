import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		String key = reader.readLine();

		int len = str.length();
		String tmp = "";

		for (int i = 0; i < len; i++) {
			if ('0' <= str.charAt(i) && str.charAt(i) <= '9')
				continue;

			tmp += str.charAt(i);
		}

		if (tmp.contains(key))
			System.out.println(1);
		else
			System.out.println(0);
	}
}
