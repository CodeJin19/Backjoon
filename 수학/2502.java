import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int d = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int a = 0;
		int b = 0;
		int cnt[][] = new int[d + 1][2];
		
		cnt[1][0] = 1;
		cnt[2][1] = 1;
		
		for(int i = 3; i <= d; i++) {
			cnt[i][0] = cnt[i - 1][0] + cnt[i - 2][0];
			cnt[i][1] = cnt[i - 1][1] + cnt[i - 2][1];
		}
		
		for(int i = 1; i <= k; i++) {
			if((k - (cnt[d][0] * i)) % cnt[d][1] == 0) {
				a = i;
				b = (k - (cnt[d][0] * i)) / cnt[d][1];
				break;
			}
		}
		
		System.out.println(a);
		System.out.println(b);
	}
}
