import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(reader.readLine());
			
			if(num == 0) {
				if(minHeap.isEmpty()) {
					sb.append("0").append("\n");
				} else {
					int topNum = minHeap.poll();
					sb.append(topNum).append("\n");
				}
			} else {
				minHeap.offer(num);
			}
		}
		
		System.out.println(sb.toString());
	}
}