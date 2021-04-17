import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		if ((n % 4) % 2 == 0)
			System.out.println("CY");
		else
			System.out.println("SK");
	}
}
