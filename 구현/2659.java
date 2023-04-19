import java.io.*;
import java.util.*;

public class Main {
	public static int getTarget(int[] numbers) {
		int min = Integer.MAX_VALUE;
		
		for(int s = 0; s < 4; s++) {
			int num = numbers[s];
			int idx = s == 3 ? 0 : s + 1;
			
			while(idx != s) {
				num *= 10;
				num += numbers[idx];
				idx++;
				idx = idx == 4 ? 0 : idx;
			}
			
			min = Math.min(min, num);
		}
		
		return min;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int[] arr = new int[4];

		for(int i = 0; i < 4; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int target = getTarget(arr);
		int num = 1111;
		int cnt = 0;
		
		while(num <= target) {
			int dup = num;
			int[] tmp = new int[4];
			int idx = 3;
			boolean flag = true;
			
			while(dup != 0) {
				tmp[idx] = dup % 10;
				
				if(tmp[idx] == 0) {
					flag = false;
					break;
				}
				
				dup /= 10;
				idx--;
			}
			
			if(flag) {
				int timeNum = getTarget(tmp);
				
				if(timeNum == num) {
					cnt++;
				}
			}
			
			num++;
		}
		
		System.out.println(cnt);
	}
}