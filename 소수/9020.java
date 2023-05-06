import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		boolean[] prime = new boolean[10010];
		
		for(int i = 1; i < prime.length; i++) {
			prime[i] = true;			
		}
		
		prime[0] = false;
		prime[1] = false;
		
		for(int i = 2; i < prime.length; i++) {
			if(prime[i]) {
				for(int j = i + i; j < prime.length;) {
					prime[j] = false;
					j += i;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 0; tc < T; tc++) {
			int n = Integer.parseInt(reader.readLine());
			
			for(int i = n / 2; 1 < i; i--) {
				if(prime[i] && prime[n - i]) {
					sb.append(i).append(" ").append((n - i)).append("\n");
					break;
				}
			}
		}
		
		System.out.println(sb.toString());
	}
}