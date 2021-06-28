import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		String ans = "";
		int len = str.length();

		for (int i = 0; i < len; i++) {
			switch (str.charAt(i)) {
			case 'a':
				ans += 'a';
				i += 2;
				break;
			case 'e':
				ans += 'e';
				i += 2;
				break;
			case 'i':
				ans += 'i';
				i += 2;
				break;
			case 'o':
				ans += 'o';
				i += 2;
				break;
			case 'u':
				ans += 'u';
				i += 2;
				break;
			default:
				ans += str.charAt(i);
			}
		}

		System.out.println(ans);
	}
}
