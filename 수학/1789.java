import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		long target = Long.parseLong(reader.readLine());
		long sum = 1;
		long cnt = 1;

		while (sum < target) {
			cnt++;
			sum += cnt;
		}
        
        if(sum == target)
            System.out.println(cnt);
        else
            System.out.println(cnt - 1);
	}
}
