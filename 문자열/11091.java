import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
        
        for(int itr = 0; itr < T; itr++) {
            String str = reader.readLine();
            int len = str.length();
            boolean flag[] = new boolean[26];
            
            for(int i = 0; i < len; i++) {
                if('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                    flag[(str.charAt(i) - 'a')] = true;
                } else if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                    flag[(str.charAt(i) - 'A')] = true;
                }
            }
            
            String ans = "";
            
            for(int i = 0; i < 26; i++)
                if(!flag[i])
                    ans += (char) ('a' + i);
            
            if(ans.length() == 0) {
                System.out.println("pangram");
            } else {
                System.out.println("missing " + ans);
            }
        }
	}
}
