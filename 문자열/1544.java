import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		ArrayList<String> list = new ArrayList<>();

		for (int itr = 0; itr < N; itr++) {
			String str = reader.readLine();
			boolean isThere = false;
			
			for(int i = 0; i < list.size(); i++) {
				String str2 = list.get(i);
				
				if(str.length() * 2 != str2.length())
					continue;
				
				if(str2.contains(str)) {
					isThere = true;
					break;
				}
			}
			
			if(!isThere) {
				str += str;
				list.add(str);
			}
		}
		
		System.out.println(list.size());
	}
}
