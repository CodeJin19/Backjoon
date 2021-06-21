import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = reader.readLine();
		int len = str.length();

		for (int i = 0; i < len; i++) {
			if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
				char tmp = (char) (str.charAt(i) + 13);

				if ('z' < tmp)
					tmp = (char) (tmp - 'z' + 'a' - 1);

				sb.append(tmp);
			} else if('A' <= str.charAt(i) && str.charAt(i) <= 'Z'){
				char tmp = (char) (str.charAt(i) + 13);

				if ('Z' < tmp)
					tmp = (char) (tmp - 'Z' + 'A' - 1);

				sb.append(tmp);
			} else {
				sb.append(str.charAt(i));
			}
		}

		System.out.println(sb);
	}
}
