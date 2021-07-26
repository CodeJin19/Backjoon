import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
        
        for(int itr = 0; itr < T; itr++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            
            int x = 0;
            int y = 0;
            
            st = new StringTokenizer(reader.readLine());
            
            for(int i = 0; i < m; i++) {
                x *= 10;
                x += Integer.parseInt(st.nextToken());
            }
            
            st = new StringTokenizer(reader.readLine());
            
            for(int i = 0; i < m; i++) {
                y *= 10;
                y += Integer.parseInt(st.nextToken());
            }
            
            st = new StringTokenizer(reader.readLine());
            
            int list[] = new int[n + m - 1];
            
            for(int i = 0; i < n; i++)
                list[i] = Integer.parseInt(st.nextToken());
            
            for(int i = 0; i < m - 1; i++)
                list[n + i] = list[i];
            
            int cnt = 0;
            
            for(int i = 0; i < n; i++) {
                int num = list[i];
                
                for(int j = 1; j < m; j++) {
                    num *= 10;
                    num += list[i + j];
                }
                
                if(x <= num && num <= y)
                    cnt++;
            }
            
            System.out.println(cnt);
        }
	}
}
