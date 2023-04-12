import java.io.*;
import java.util.*;

public class Main {
	static boolean[] numbers;
	
	public static void check(String num, String targetNum, int strike, int ball) {
		int cntStrike = 0;
		int cntBall = 0;

		for(int i = 0; i < 3; i++) {
			if(num.charAt(i) == targetNum.charAt(i)) {
				cntStrike++;
			} else {
				for(int j = 0; j < 3; j++) {
					if(num.charAt(i) == targetNum.charAt(j)) {
						cntBall++;
					}
				}
			}
		}
		
		if(cntStrike != strike || cntBall != ball) {
			numbers[Integer.parseInt(num)] = false;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		
		numbers = new boolean[1000];
		
		for(int i = 100; i < 1000; i++) {
			int[] cache = new int[10];
			int tmp = i;
			
			while(tmp != 0) {
				cache[tmp % 10]++;
				tmp/= 10;
			}
			
			boolean flag = true;
			
			if(0 < cache[0]) {
				numbers[i] = false;
				continue;
			}
			
			for(int j = 1; j < 10; j++) {
				if(1 < cache[j]) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				numbers[i] = true;				
			} else {
				numbers[i] = false;
			}
		}
		
		for(int line = 0; line < n; line++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			String num = st.nextToken();
			int strike = Integer.parseInt(st.nextToken());
			int ball = Integer.parseInt(st.nextToken());
			
			for(int i = 100; i < 1000; i++) {
				if(!numbers[i]) {
					continue;
				}
				
				String stringI = "" + i;
				
				check(stringI, num, strike, ball);
			}
		}
		
		int cnt = 0;
		
		for(int i = 100; i < 1000; i++) {
			if(numbers[i]) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}