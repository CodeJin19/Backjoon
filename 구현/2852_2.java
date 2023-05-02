import java.io.*;
import java.util.*;

public class Main {
	static int swap(String string) {
		int min = (int)(string.charAt(0) - '0') * 10 + (int)(string.charAt(1) - '0');
		int sec = (int)(string.charAt(3) - '0') * 10 + (int)(string.charAt(4) - '0');
		int time = min * 60 + sec;
		return time;
	}
	
	static String reverse(int time) {
		int sec = time % 60;
		int min = (time - sec) / 60;
		
		StringBuilder sb = new StringBuilder();
		int tmp = sec % 10;
		
		sb.append((char)('0' + tmp));
		
		tmp = (sec / 10);
		
		sb.append((char)('0' + tmp));
		
		sb.append(":");
		
		tmp = min % 10;
		
		sb.append((char)('0' + tmp));
		
		tmp = (min / 10);
		
		sb.append((char)('0' + tmp));
		
		return sb.reverse().toString();
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		StringTokenizer st;
		int[][] log = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());
			
			int team = Integer.parseInt(st.nextToken());
			int time = swap(st.nextToken());
			
			log[i][0] = time;
			log[i][1] = team;
		}
		
		Arrays.sort(log, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		
		int score1 = 0;
		int score2 = 0;
		int time1 = 0;
		int time2 = 0;
		int beforeTime = 0;
		int winningTime = 0;
		
		for(int i = 0; i < n; i++) {
			if(score2 < score1) {
				winningTime = log[i][0] - beforeTime;
				time1 += winningTime;
			} else if(score1 < score2) {
				winningTime = log[i][0] - beforeTime;
				time2 += winningTime;
			}

			if(log[i][1] == 1) {
				score1++;
				beforeTime = log[i][0];
			} else {
				score2++;
				beforeTime = log[i][0];
			}
		}
		
		if(score2 < score1) {
			winningTime = 2880 - beforeTime;
			time1 += winningTime;
		} else if(score1 < score2) {
			winningTime = 2880 - beforeTime;
			time2 += winningTime;
		}
		
		System.out.println(reverse(time1) + "\n" + reverse(time2));
	}
}