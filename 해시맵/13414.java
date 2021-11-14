import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int k = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());

		String[] list = new String[l];

		for (int i = 0; i < l; i++)
			list[i] = reader.readLine();

		Stack<String> stck = new Stack<>();
		HashMap<String, Integer> cache = new HashMap<>();

		for (int i = l - 1; 0 <= i; i--) {
			if (!cache.containsKey(list[i])) {
				stck.push(list[i]);
				cache.put(list[i], 1);
			}
		}

		int len = Math.min(k, stck.size());
		for (int i = 0; i < len; i++)
			System.out.println(stck.pop());
	}
}
