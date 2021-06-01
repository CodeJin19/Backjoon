import java.io.*;

public class Main {
	static boolean check(String str, int idx, int len) {
		if (len <= idx)
			return true;

		boolean ret = false;

		if (str.charAt(idx) == '1') {
			idx++;
			if (len <= idx || str.charAt(idx) == '1')
				return false;

			idx++;
			if (len <= idx || str.charAt(idx) == '1')
				return false;

			while (idx < len && str.charAt(idx) == '0')
				idx++;

			if (idx == len)
				return false;

			// (100+1+ | 01)+
			while (!ret && idx < len && str.charAt(idx) == '1') {
				ret = ret | check(str, idx + 1, len);
				idx++;
			}

		} else if (str.charAt(idx) == '0') {
			idx++;
			if (len <= idx || str.charAt(idx) == '0')
				return false;

			ret = ret | check(str, idx + 1, len);
		}

		return ret;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		String str;
		int len;

		for (int testcase = 0; testcase < T; testcase++) {
			str = reader.readLine();
			len = str.length();

			if (check(str, 0, len))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
