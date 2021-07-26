import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(reader.readLine());
            
            for(int j = 0; j < m; j++) {
                int r = Integer.parseInt(st.nextToken());
                int g = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int sum = 2126 * r + 7152 * g + 722 * b;
                
                if(sum < 510000)
                    sb.append("#");
                else if(sum < 1020000)
                    sb.append("o");
                else if(sum < 1530000)
                    sb.append("+");
                else if(sum < 2040000)
                    sb.append("-");
                else
                    sb.append(".");
            }
            
            sb.append("\n");
        }
        
        System.out.println(sb);
	}
}
