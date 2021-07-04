import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());
		num--;

		int n = num / 14;
		int r = num % 14;

		switch (r) {
		case 0:
		case 12:
			System.out.println("baby");
			break;
		case 1:
		case 13:
			System.out.println("sukhwan");
			break;
		case 2:
		case 6:
		case 10:
			if (n == 0)
				System.out.println("tururu");
			else if (n == 1)
				System.out.println("turururu");
			else if (n == 2)
				System.out.println("tururururu");
			else
				System.out.println("tu+ru*" + (n + 2));
			break;
		case 3:
		case 7:
		case 11:
			if (n == 0)
				System.out.println("turu");
			else if (n == 1)
				System.out.println("tururu");
			else if (n == 2)
				System.out.println("turururu");
			else if (n == 3)
				System.out.println("tururururu");
			else
				System.out.println("tu+ru*" + (n + 1));
			break;
		case 4:
			System.out.println("very");
			break;
		case 5:
			System.out.println("cute");
			break;
		case 8:
			System.out.println("in");
			break;
		case 9:
			System.out.println("bed");
			break;
		}
	}
}
