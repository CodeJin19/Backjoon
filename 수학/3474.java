import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 0; tc < t; tc++) {
			int num = Integer.parseInt(reader.readLine());
			int val = 5;
			int cnt = 0;
			
			while(val <= num) {
				cnt += (num / val);
				val *= 5;
			}
			
			sb.append(cnt).append("\n");
		}
		
		System.out.println(sb.toString());
	}
}