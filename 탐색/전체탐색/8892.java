import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());

		for (int itr = 0; itr < T; itr++) {
			int n = Integer.parseInt(reader.readLine());
			String list[] = new String[n];
			
			for(int i = 0; i < n; i++)
				list[i] = reader.readLine();
			
			StringBuilder sb;
			boolean isThere = false;
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
                    if(i == j)
                        continue;
                    
					String str = list[i] + list[j];
					int len = str.length();
					boolean flag = true;
					
					for(int k = 0; k < len / 2; k++) {
						if(str.charAt(k) != str.charAt(len - 1 - k)) {
							flag = false;
							break;
						}
					}
					
					if(flag) {
						System.out.println(str);
						isThere = true;
						j = n;
						i = n;
					}
				}
			}
			
			if(!isThere) {
				System.out.println(0);
			}
		}
	}
}
