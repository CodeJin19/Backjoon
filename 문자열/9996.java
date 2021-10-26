import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine());
		String code = reader.readLine();

		StringBuilder sb = new StringBuilder();

		for (int itr = 0; itr < t; itr++) {
			String tmp = reader.readLine();

			if (decode(code, 0, code.length(), tmp, 0, tmp.length()))
				sb.append("DA").append("\n");
			else
				sb.append("NE").append("\n");
		}

		System.out.println(sb);
	}

	static boolean decode(String code, int codeIdx, int codeLen, String tmp, int tmpIdx, int tmpLen) {
		if (codeLen <= codeIdx) {
			if (tmpIdx == tmpLen)
				return true;
			else
				return false;
		}

		boolean ret = false;

		if (code.charAt(codeIdx) == '*') {
			for (int i = tmpIdx; i < tmpLen; i++) {
				if (code.charAt(codeIdx + 1) == tmp.charAt(i)) {
					if (decode(code, codeIdx + 2, codeLen, tmp, i + 1, tmpLen)) {
						return true;
					}
				}
			}
		} else {
			if (code.charAt(codeIdx) == tmp.charAt(tmpIdx))
				ret = ret | decode(code, codeIdx + 1, codeLen, tmp, tmpIdx + 1, tmpLen);
			else
				return false;
		}

		return ret;
	}
}
