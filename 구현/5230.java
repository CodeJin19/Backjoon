import java.util.Scanner;

public class Main {
	private static String decode(String prefixCode, String code) {
		// prefixCode = encoding       (e.g., "*ab")
		// code = string to be decoded (e.g., "10110"
		// NOTE: can find character in string s at index i w/ s.charAt(i)

		String result = "";

		/* ------------------- INSERT CODE HERE ---------------------*/
        int len = code.length();
        int idx = 0;

        while(idx < len) {
            int k = 0;
            
            while(prefixCode.charAt(k) == '*') {
                if(code.charAt(idx++) == '0')
                    k = 2 * k + 1;
                else
                    k = 2 * k + 2;
            }
            
            result += prefixCode.charAt(k);
        }

		/* -------------------- END OF INSERTION --------------------*/

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resultStr = "";

		int numCases = sc.nextInt();

		for(int i = 0; i < numCases; i++) 
		{
			// format = <numCodes> <prefixCode> <code1> <code2> ...
			int numCodes = sc.nextInt();

			String prefixCode = sc.next();
			for(int k = 0; k < numCodes; k++) {
                if(k == 0) 
                    resultStr = decode(prefixCode, sc.next()); 
                else
                    resultStr = resultStr + " " + decode(prefixCode, sc.next()); 
            }
			System.out.println(resultStr);
		}
	}
}
