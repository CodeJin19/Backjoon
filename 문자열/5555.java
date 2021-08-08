import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String target = reader.readLine();
		int num = Integer.parseInt(reader.readLine());
		int cnt = 0;

		for (int itr = 0; itr < num; itr++) {
			String input = reader.readLine();
			int len = target.length();
			
			for(int i = 0; i < len; i++)
				input += input.charAt(i);
			
			boolean isThere = input.contains(target);
			
			if(isThere)
				cnt++;
		}

		System.out.println(cnt);
	}
}
