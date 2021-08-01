import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int len = str.length();
		boolean flag[] = new boolean[4];

		for (int i = 0; i < len; i++) {
			switch (str.charAt(i)) {
			case 'U':
				if (!flag[0])
					flag[0] = true;
				break;
			case 'C':
				if(flag[2])
					flag[3] = true;
				else if (flag[0])
					flag[1] = true;
				break;
			case 'P':
				if (flag[1])
					flag[2] = true;
				break;
			}
		}

		if (flag[3])
			System.out.println("I love UCPC");
		else
			System.out.println("I hate UCPC");
	}
}
