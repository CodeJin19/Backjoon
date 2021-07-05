import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());

		if (num == 4) {
			System.out.println("4");
		} else {
			String ans = "4";
			String next = "7";

			while (Integer.parseInt(next) <= num) {
				ans = next;

				StringBuilder rev = new StringBuilder();
				StringBuilder tmp = new StringBuilder();

				int len = next.length();
				boolean carry = false;

				if (next.charAt(len - 1) == '4') {
					rev.append("7");
				} else {
					rev.append("4");
					carry = true;
				}

				for (int i = len - 2; 0 <= i; i--) {
					if (next.charAt(i) == '4') {
						if (carry) {
							rev.append("7");
							carry = false;
						} else {
							rev.append("4");
						}
					} else {
						if (carry) {
							rev.append("4");
						} else {
							rev.append("7");
						}
					}
				}
				
				if(carry)
					rev.append("4");
				
				len = rev.length();
				
				for(int i = len - 1; 0 <= i; i--)
					tmp.append(rev.charAt(i));

				next = tmp.toString();
			}

			System.out.println(ans);
		}
	}
}
