import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
		int prev[][], now[][];
		int n, m, r, x, y;

		str = reader.readLine();
		st = new StringTokenizer(str, " ");

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());

		now = new int[n][m];

		for (int i = 0; i < n; i++) {
			str = reader.readLine();
			st = new StringTokenizer(str, " ");

			for (int j = 0; j < m; j++) {
				now[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		str = reader.readLine();
		st = new StringTokenizer(str, " ");

		while (st.hasMoreTokens()) {
			prev = new int[now.length][now[0].length];

			for (int i = 0; i < now.length; i++)
				for (int j = 0; j < now[0].length; j++)
					prev[i][j] = now[i][j];

			switch (Integer.parseInt(st.nextToken())) {
			case 1:
				for (int i = 0; i < prev.length; i++)
					for (int j = 0; j < prev[0].length; j++)
						now[i][j] = prev[prev.length - 1 - i][j];
				break;
			case 2:
				for (int i = 0; i < prev.length; i++)
					for (int j = 0; j < prev[0].length; j++)
						now[i][j] = prev[i][prev[0].length - 1 - j];
				break;
			case 3:
				now = new int[prev[0].length][prev.length];

				for (int i = 0; i < prev.length; i++) {
					x = prev.length - 1 - i;
					y = 0;

					for (int j = 0; j < prev[0].length; j++) {
						now[y++][x] = prev[i][j];
					}
				}
				break;
			case 4:
				now = new int[prev[0].length][prev.length];

				for (int i = 0; i < prev.length; i++) {
					x = i;
					y = prev[0].length - 1;

					for (int j = 0; j < prev[0].length; j++) {
						now[y--][x] = prev[i][j];
					}
				}
				break;
			case 5:
				y = 0;
				for (int i = 0; i < prev.length / 2; i++) {
					x = prev[0].length / 2;

					for (int j = 0; j < prev[0].length / 2; j++) {
						now[y][x++] = prev[i][j];
					}

					y++;
				}

				y = prev.length / 2;
				for (int i = 0; i < prev.length / 2; i++) {
					x = prev[0].length / 2;

					for (int j = prev[0].length / 2; j < prev[0].length; j++) {
						now[y][x++] = prev[i][j];
					}

					y++;
				}

				y = prev.length / 2;
				for (int i = prev.length / 2; i < prev.length; i++) {
					x = 0;

					for (int j = prev[0].length / 2; j < prev[0].length; j++) {
						now[y][x++] = prev[i][j];
					}

					y++;
				}

				y = 0;
				for (int i = prev.length / 2; i < prev.length; i++) {
					x = 0;

					for (int j = 0; j < prev[0].length / 2; j++) {
						now[y][x++] = prev[i][j];
					}

					y++;
				}
				break;
			case 6:
				y = prev.length / 2;
				for (int i = 0; i < prev.length / 2; i++) {
					x = 0;

					for (int j = 0; j < prev[0].length / 2; j++) {
						now[y][x++] = prev[i][j];
					}

					y++;
				}

				y = 0;
				for (int i = 0; i < prev.length / 2; i++) {
					x = 0;

					for (int j = prev[0].length / 2; j < prev[0].length; j++) {
						now[y][x++] = prev[i][j];
					}

					y++;
				}

				y = 0;
				for (int i = prev.length / 2; i < prev.length; i++) {
					x = prev[0].length / 2;

					for (int j = prev[0].length / 2; j < prev[0].length; j++) {
						now[y][x++] = prev[i][j];
					}

					y++;
				}

				y = prev.length / 2;
				for (int i = prev.length / 2; i < prev.length; i++) {
					x = prev[0].length / 2;

					for (int j = 0; j < prev[0].length / 2; j++) {
						now[y][x++] = prev[i][j];
					}

					y++;
				}
				break;
			}
		}

		for (int i = 0; i < now.length; i++) {
			sb.append(now[i][0]);
			for (int j = 1; j < now[0].length; j++)
				sb.append(" ").append(now[i][j]);
			sb.append("\n");
		}

		System.out.print(sb);
	}
}
