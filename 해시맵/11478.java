import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int len = str.length();
		HashMap<String, Integer> subStrMap = new HashMap<>();

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j <= len; j++) {
				String tmp = str.substring(i, j);
				subStrMap.put(tmp, 1);
			}
		}

		System.out.println(subStrMap.size());
	}
}
