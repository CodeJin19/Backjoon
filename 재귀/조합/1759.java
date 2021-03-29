import java.io.*;
import java.util.Arrays;

public class Main {
	public static void getComb(char arr[], int toSelect, int startIdx, int Selected[]) {
		if (toSelect == Selected.length) {
			boolean isValid = false;
			int v = 0;
			int c = 0;

			for (int i = 0; i < toSelect; i++) {
				if (1 <= v && 2 <= c) {
					isValid = true;
					break;
				}
				switch (arr[Selected[i]]) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					v++;
					break;
				default:
					c++;
					break;
				}
			}

			if (isValid || (1 <= v && 2 <= c)) {
				for (int i = 0; i < toSelect; i++)
					System.out.print(arr[Selected[i]]);
				System.out.println();
			}
			return;
		}

		for (int i = startIdx; i < arr.length; i++) {
			Selected[toSelect] = i;
			getComb(arr, toSelect + 1, i + 1, Selected);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		String tmp[];
		char arr[];
		int l, c;

		l = Integer.parseInt(str.split(" ")[0]);
		c = Integer.parseInt(str.split(" ")[1]);

		arr = new char[c];

		str = reader.readLine();
		tmp = str.split(" ");

		for (int i = 0; i < c; i++)
			arr[i] = tmp[i].charAt(0);

		Arrays.sort(arr);

		getComb(arr, 0, 0, new int[l]);
	}
}
