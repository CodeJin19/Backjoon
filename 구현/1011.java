import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(reader.readLine());
		
		for(int itr = 0; itr < T; itr++) {
			st = new StringTokenizer(reader.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int dist = y - x;
			
			if(dist == 1) {
				System.out.println(1);
			} else {
				long maxLen = 2;
				int ans = 2;
				int add = 2;
				boolean isOdd = true;
				
				while(maxLen < dist) {
					if(isOdd) {
						maxLen += add;
						isOdd = false;
						ans++;
					} else {
						maxLen += add;
						isOdd = true;
						ans++;
						add++;
					}
				}
				
				System.out.println(ans);
			}
		}
	}
}
