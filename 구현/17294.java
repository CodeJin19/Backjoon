import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String num = reader.readLine();
		int len = num.length();
		boolean isCuteNum = true;

		if (1 < len) {
			int num1 = (num.charAt(0) - '0');
			int num2 = (num.charAt(1) - '0');
			int d = num2 - num1;
			
			
			for(int i = 2; i < len; i++) {
				num1 = num2;
				num2 = (num.charAt(i) - '0');
				
				if(num2 - num1 != d) {
					isCuteNum = false;
					break;
				}
			}
		}

		if (isCuteNum)
			System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
		else
			System.out.println("흥칫뿡!! <(￣ ﹌ ￣)>");
	}
}
