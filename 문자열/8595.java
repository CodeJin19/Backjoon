import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(reader.readLine());
		String str = reader.readLine();
		long sum = 0;
		long tmp = 0;
		boolean flag = false;

		for (int i = 0; i < len; i++) {
			if ('0' <= str.charAt(i) && str.charAt(i) <= '9') {
				if (flag) {
					tmp *= 10;
					tmp += (int) (str.charAt(i) - '0');
				} else {
					flag = true;
					tmp = str.charAt(i) - '0';
				}
			} else {
				if (flag) {
					flag = false;
					sum += tmp;
					tmp = 0;
				}
			}
		}

		if(tmp != 0)
			sum += tmp;

		System.out.println(sum);
	}
}
