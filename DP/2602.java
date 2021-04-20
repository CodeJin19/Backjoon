import java.io.*;

public class Main {
	static String rune;
	static String demon;
	static String angel;
	static int demonCache[][];
	static int angelCache[][];
	static int runeLen;
	static int len;

	public static int getDemon(int now, int idx) {
		if (-1 < demonCache[now][idx])
			return demonCache[now][idx];

		if(idx == runeLen - 1) {
			demonCache[now][idx] = 1;
			return demonCache[now][idx];
		}
		
		int ret = 0;

		for (int i = now + 1; i < len; i++)
			if (angel.charAt(i) == rune.charAt(idx + 1))
				ret += getAngel(i, idx + 1);

		demonCache[now][idx] = ret;
		return demonCache[now][idx];
	}

	public static int getAngel(int now, int idx) {
		if (-1 < angelCache[now][idx])
			return angelCache[now][idx];
		
		if(idx == runeLen - 1) {
			angelCache[now][idx] = 1;
			return angelCache[now][idx];
		}

		int ret = 0;

		for (int i = now + 1; i < len; i++)
			if (demon.charAt(i) == rune.charAt(idx + 1))
				ret += getDemon(i, idx + 1);

		angelCache[now][idx] = ret;
		return angelCache[now][idx];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		rune = reader.readLine();
		demon = reader.readLine();
		angel = reader.readLine();
		runeLen = rune.length();
		len = demon.length();
		demonCache = new int[len][runeLen];
		angelCache = new int[len][runeLen];
        
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < runeLen; j++) {
                demonCache[i][j] = -1;
                angelCache[i][j] = -1;
            }
        }

		int ans = 0;

		for (int i = 0; i < len; i++) {
			if (demon.charAt(i) == rune.charAt(0)) {
				ans += getDemon(i, 0);
			}

			if (angel.charAt(i) == rune.charAt(0)) {
				ans += getAngel(i, 0);
			}
		}

		System.out.println(ans);
	}
}
