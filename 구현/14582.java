import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int Gem[] = new int[9];
		int Ger[] = new int[9];
		
		StringTokenizer st = new StringTokenizer(reader.readLine());
		
		for(int i = 0; i < 9; i++)
			Gem[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(reader.readLine());
		
		for(int i = 0; i < 9; i++)
			Ger[i] = Integer.parseInt(st.nextToken());
		
		int gemScore = 0;
		int gerScore = 0;
		boolean flag1 = false;
		boolean flag2 = false;
		
		for(int i = 0; i < 9; i++) {
			gemScore += Gem[i];
			
			if(gerScore < gemScore) {
				flag1 = true;
			} else if(gemScore < gerScore && flag1) {
				flag2 = true;
				break;
			}
			
			gerScore += Ger[i];
			
			if(gerScore < gemScore) {
				flag1 = true;
			} else if(gemScore < gerScore && flag1) {
				flag2 = true;
				break;
			}
		}
		
		if(flag2)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
