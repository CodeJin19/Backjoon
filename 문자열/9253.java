import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String strA = reader.readLine();
		String strB = reader.readLine();
		String strAns = reader.readLine();

		if (strA.contains(strAns) && strB.contains(strAns))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
