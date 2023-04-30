import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String word = reader.readLine();
		int len = word.length();
		boolean java = true;
		boolean cpp = true;
		
		if('A' <= word.charAt(0) && word.charAt(0) <= 'Z') {
			java = false;
			cpp = false;
		} else if('_' == word.charAt(0)) {
			java = false;
			cpp = false;
		} else if('_' == word.charAt(len - 1)) {
			java = false;
			cpp = false;
		} else {
			for(int i = 0; i < len - 1; i++) {
				if(word.charAt(i) == '_' && word.charAt(i + 1) == '_') {
					java = false;
					cpp = false;
					break;
				}
			}
			
			if(java || cpp) {
				for(int i = 1; i < len; i++) {
					if(word.charAt(i) == '_') {
						java = false;
						break;
					}
				}
				
				for(int i = 0; i < len; i++) {
					if('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
						cpp = false;
						break;
					}
				}
			}
		}

		if (!java && !cpp) {
			System.out.println("Error!");
		} else if (cpp) {
			StringBuilder ans = new StringBuilder();

			for (int i = 0; i < len; i++) {
				if (word.charAt(i) == '_') {
					i++;
					if(i < len) {
						char x = word.charAt(i);
						ans.append((char) (x - 'a' + 'A'));						
					}
				} else {
					ans.append(word.charAt(i));
				}
			}

			System.out.println(ans);
		} else if(java){
			StringBuilder ans = new StringBuilder();

			for (int i = 0; i < len; i++) {
				if ('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
					ans.append("_");
					char x = word.charAt(i);
					ans.append((char) (x - 'A' + 'a'));
				} else {
					ans.append(word.charAt(i));
				}
			}

			System.out.println(ans);
		} else {
			System.out.println(word);
		}
	}
}