import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int lx = Integer.parseInt(st.nextToken());
		int ly = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(reader.readLine());
		int side, pos;
		int sum = 0;
		int list[][] = new int[n][2];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());
			list[i][0] = Integer.parseInt(st.nextToken());
			list[i][1] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(reader.readLine());
		side = Integer.parseInt(st.nextToken());
		pos = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; i++) {
			if ((side + 1) / 2 == (list[i][0] + 1) / 2) {
				if (side == list[i][0]) {
					sum += Math.abs(pos - list[i][1]);
				} else {
					if ((side + 1) / 2 == 1) {
						sum += ly;
						sum += Math.min(pos + list[i][1], (lx - pos) + (lx - list[i][1]));
					} else {
						sum += lx;
						sum += Math.min(pos + list[i][1], (ly - pos) + (ly - list[i][1]));
					}
				}
			} else {
				switch (side) {
				case 1:
					if (list[i][0] == 3) {
						sum += pos;
						sum += list[i][1];
					} else {
						sum += (lx - pos);
						sum += list[i][1];
					}
					break;
				case 2:
					if (list[i][0] == 3) {
						sum += pos;
						sum += (ly - list[i][1]);
					} else {
						sum += (lx - pos);
						sum += (ly - list[i][1]);
					}
					break;
				case 3:
					if (list[i][0] == 1) {
						sum += pos;
						sum += list[i][1];
					} else {
						sum += (ly - pos);
						sum += list[i][1];
					}
					break;
				case 4:
					if (list[i][0] == 1) {
						sum += pos;
						sum += (lx - list[i][1]);
					} else {
						sum += (ly - pos);
						sum += (lx - list[i][1]);
					}
					break;
				}
			}
		}

		System.out.println(sum);
	}
}
