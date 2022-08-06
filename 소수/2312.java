import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();
		boolean isPrime[] = new boolean[100010];
		int prime[] = new int[10000];
		int primeIdx = 0;
		
		for(int i = 2; i <= 100000; i++) {
			isPrime[i] = true;
		}
		
		for(int i = 2; i <= 100000; i++) {
			if(!isPrime[i]) {
				continue;
			}
			
			prime[primeIdx++] = i;
			
			for(int j = i + i; j <= 100000; ) {
				isPrime[j] = false;
				j += i;
			}
		}

		for(int itr = 0; itr < n; itr++) {
			int num = Integer.parseInt(reader.readLine());
			int idx = 0;
			int maxIdx = 0;
			int cnt[] = new int[10000];
			
			while(num != 1) {
				while(num % prime[idx] != 0) {
					idx++;
				}
				
				num /= prime[idx];
				cnt[idx]++;
				maxIdx = maxIdx < idx ? idx : maxIdx;
				idx = 0;
			}
			
			for(int i = 0; i <= maxIdx; i++) {
				if(0 < cnt[i]) {
					sb.append(prime[i]).append(" ").append(cnt[i]).append("\n");
				}
			}
		}
		
		System.out.println(sb);
	}
}
