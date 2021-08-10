import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());
		int cnt = 0;
		int from = 1;
		int to = 1;
		int sum = 1;
		
		while(from <= num) {
			while(sum < num)
				sum += ++to;
			
			if(sum == num)
				cnt++;
			else
				sum -= to--;
			
			sum -= from++;
		}
		
		System.out.println(cnt);
	}
}
