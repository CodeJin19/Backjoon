import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};
		int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
		
		while(w != 0 || h != 0) {
			int[][] fld = new int[h][w];
			int[][] cache = new int[h][w];
			int cnt = 0;
			
			for(int i = 0; i < h; i++) {
				st = new StringTokenizer(reader.readLine());
				
				for(int j = 0; j < w; j++) {
					fld[i][j] = Integer.parseInt(st.nextToken());
					cache[i][j] = -1;
				}
			}
			
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(cache[i][j] == -1) { //미방문
						if(fld[i][j] == 0) { //바다
							cache[i][j] = 0;
						} else { //섬
							cnt++;
							Queue<int[]> queue = new LinkedList<>();
							int[] tmp = new int[2];
							tmp[0] = i; //y
							tmp[1] = j; //x
							cache[i][j] = cnt;
							
							queue.offer(tmp);
							
							while(!queue.isEmpty()) {
								tmp = queue.poll();
								int y = tmp[0];
								int x = tmp[1];
								
								for(int k = 0; k < 8; k++) {
									int ny = y + dy[k];
									int nx = x + dx[k];
									
									if(ny < 0 || h <= ny || nx < 0 || w <= nx || 0 <= cache[ny][nx] || fld[ny][nx] == 0) {
										continue;
									}
									
									tmp = new int[2];
									tmp[0] = ny;
									tmp[1] = nx;
									cache[ny][nx] = cnt;
									
									queue.offer(tmp);
								}
							}
                        }
					}
				}
			}
			
			sb.append(cnt).append("\n");
			
			st = new StringTokenizer(reader.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(sb.toString());
	}
}