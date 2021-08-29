import java.io.*;
import java.util.*;

import sun.java2d.loops.ScaledBlit;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int color[] = new int[n];

		st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < n; i++)
			color[i] = Integer.parseInt(st.nextToken());

		int prev = color[0];
		int max = 0;
		int len = 1;

		for (int i = 1; i < n; i++) {
			if (prev != color[i]) {
				len++;
			} else {
				max = Math.max(max, len);
				len = 1;
			}
			prev = color[i];
		}
		
		max = Math.max(max,  len);

		System.out.println(max);
	}
}
