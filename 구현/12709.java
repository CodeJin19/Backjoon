import java.io.*;
import java.util.*;

public class Main {
	static int perm[][];
	static int permIdx;
	static int min;
	
	static int comp(String str) {
		int ret = 1;
		int len = str.length();
		char before = str.charAt(0);
		
		for(int i = 1; i < len; i++) {
			if(str.charAt(i) != before) { 
				ret++;
				before = str.charAt(i);
			}
			
			if(min < ret)
				return ret;
		}
		
		return ret;
	}
	
	static String swap(String str) {
		int idx = 0;
		int len = str.length();
		int limit = len / perm[0].length;
		StringBuilder ret = new StringBuilder();
		
		for(int i = 0; i < limit; i++) {
			for(int j = 0; j < perm[0].length; j++)
				ret.append(str.charAt(idx + perm[permIdx][j] - 1));
			
			idx += perm[0].length;
		}
		
		return ret.toString();
	}

	static void getPerm(int idx, int k, int tmp[], boolean cache[]) {
		if (idx == tmp.length) {
			for (int i = 0; i < k; i++)
				perm[permIdx][i] = tmp[i];

			permIdx++;
			return;
		}

		for (int i = 1; i <= k; i++) {
			if (!cache[i]) {
				cache[i] = true;
				tmp[idx] = i;
				getPerm(idx + 1, k, tmp, cache);
				cache[i] = false;
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();

		for (int itr = 1; itr <= T; itr++) {
			int k = Integer.parseInt(reader.readLine());
			String s = reader.readLine();

			int limit = 1;

			for (int i = 1; i <= k; i++)
				limit *= i;

			perm = new int[limit][k];
			permIdx = 0;

			int tmp[] = new int[k];
			boolean cache[];

			for (int i = 1; i <= k; i++) {
				tmp[0] = i;
				cache = new boolean[k + 1];
				cache[i] = true;

				getPerm(1, k, tmp, cache);
			}

			min = Integer.MAX_VALUE;

			for (int i = 0; i < perm.length; i++) {
				permIdx = i;
				String str = swap(s);
				int cnt = comp(str);
				min = Math.min(min, cnt);
			}
			
			sb.append("Case #").append(itr).append(": ").append(min).append("\n");
		}

		System.out.print(sb);
	}
}
