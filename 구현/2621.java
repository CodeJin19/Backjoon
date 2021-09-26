import java.io.*;
import java.util.*;

public class Main {
	static boolean[][] fld;
	static int[] numCnt;
	static int[] colorCnt;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		fld = new boolean[4][10];
		numCnt = new int[10];
		colorCnt = new int[4];

		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			String color = st.nextToken();
			int num = Integer.parseInt(st.nextToken());

			if (color.compareTo("R") == 0)
				fld[0][num] = true;
			else if (color.compareTo("B") == 0)
				fld[1][num] = true;
			else if (color.compareTo("Y") == 0)
				fld[2][num] = true;
			else if (color.compareTo("G") == 0)
				fld[3][num] = true;
		}

		for (int i = 1; i < 10; i++)
			for (int j = 0; j < 4; j++)
				if (fld[j][i])
					numCnt[i]++;

		for (int i = 0; i < 4; i++)
			for (int j = 1; j < 10; j++)
				if (fld[i][j])
					colorCnt[i]++;

		int score = 0;
		int y = 0;
		int x = 0;

		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 4; i++) {
				if (fld[i][j] == true) {
					y = i;
					x = j;
					j = 10;
					break;
				}
			}
		}

		if (isStraightFlush(y, x)) {
			score += 900 + x + 4;
		} else if (isFourCards()) {
			score += 800;

			for (int i = 1; i < 10; i++)
				if (numCnt[i] == 4)
					score += i;
		} else if (isFullhouse()) {
			int treeple = 0;
			int pair = 0;
			score += 700;

			for (int i = 1; i < 10; i++) {
				if (numCnt[i] == 3)
					treeple = i;
				else if (numCnt[i] == 2)
					pair = i;
			}

			score += treeple * 10 + pair;
		} else if (isFlush()) {
			score += 600;

			for (int i = 9; 0 < i; i--) {
				if (0 < numCnt[i]) {
					score += i;
					break;
				}
			}
		} else if (isStraight(x)) {
			score += 500 + x + 4;
		} else if (isTreeple()) {
			score += 400;

			for (int i = 1; i < 10; i++)
				if (numCnt[i] == 3)
					score += i;
		} else if (isTwoPair()) {
			int big = 0;
			int small = 0;
			score += 300;

			for (int i = 9; 0 < i; i--) {
				if (numCnt[i] == 2) {
					if (big == 0)
						big = i;
					else
						small = i;
				}
			}

			score += big * 10 + small;
		} else if (isPair()) {
			score += 200;

			for (int i = 1; i < 10; i++)
				if (numCnt[i] == 2)
					score += i;
		} else {
			score += 100;

			for (int i = 9; 0 < i; i--) {
				if (0 < numCnt[i]) {
					score += i;
					break;
				}
			}
		}

		System.out.println(score);
	}

	static boolean isStraightFlush(int y, int x) {
		int cnt = 0;

		for (int i = 0; i < 5; i++) {
			if (fld[y][x + i])
				cnt++;
			else
				break;
		}

		if (cnt == 5)
			return true;
		else
			return false;
	}

	static boolean isFourCards() {
		for (int i = 1; i < 10; i++)
			if (numCnt[i] == 4)
				return true;

		return false;
	}

	static boolean isFullhouse() {
		int treeple = 0;
		int pair = 0;

		for (int i = 1; i < 10; i++) {
			if (numCnt[i] == 3)
				treeple++;
			else if (numCnt[i] == 2)
				pair++;
		}

		if (treeple == 1 && pair == 1)
			return true;
		else
			return false;
	}

	static boolean isFlush() {
		for (int i = 0; i < 4; i++)
			if (colorCnt[i] == 5)
				return true;

		return false;
	}

	static boolean isStraight(int x) {
		int cnt = 0;

		for (int i = 0; i < 5; i++) {
			if (0 < numCnt[x + i])
				cnt++;
			else
				break;
		}

		if (cnt == 5)
			return true;
		else
			return false;
	}

	static boolean isTreeple() {
		for (int i = 1; i < 10; i++)
			if (numCnt[i] == 3)
				return true;

		return false;
	}

	static boolean isTwoPair() {
		int pair = 0;

		for (int i = 1; i < 10; i++)
			if (numCnt[i] == 2)
				pair++;

		if (pair == 2)
			return true;
		else
			return false;
	}

	static boolean isPair() {
		int pair = 0;

		for (int i = 1; i < 10; i++)
			if (numCnt[i] == 2)
				pair++;

		if (pair == 1)
			return true;
		else
			return false;
	}
}
