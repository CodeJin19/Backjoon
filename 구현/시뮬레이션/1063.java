import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		String str = st.nextToken();
		int xKing = str.charAt(0) - 'A';
		int yKing = str.charAt(1) - '1';

		str = st.nextToken();
		int xStone = str.charAt(0) - 'A';
		int yStone = str.charAt(1) - '1';

		int n = Integer.parseInt(st.nextToken());
		int xKingPrev, yKingPrev;
		boolean isPossible;

		for (int i = 0; i < n; i++) {
			str = reader.readLine();
			xKingPrev = xKing;
			yKingPrev = yKing;
			isPossible = true;

			if (str.compareTo("R") == 0) {
				if (xKing + 1 < 8) {
					xKing++;

					if (xKing == xStone && yKing == yStone) {
						if (xStone + 1 < 8)
							xStone++;
						else
							isPossible = false;
					}
				}
			} else if (str.compareTo("L") == 0) {
				if (0 <= xKing - 1) {
					xKing--;

					if (xKing == xStone && yKing == yStone) {
						if (0 <= xStone - 1)
							xStone--;
						else
							isPossible = false;
					}
				}
			} else if (str.compareTo("B") == 0) {
				if (0 <= yKing - 1) {
					yKing--;

					if (xKing == xStone && yKing == yStone) {
						if (0 <= yStone - 1)
							yStone--;
						else
							isPossible = false;
					}
				}
			} else if (str.compareTo("T") == 0) {
				if (yKing + 1 < 8) {
					yKing++;

					if (xKing == xStone && yKing == yStone) {
						if (yStone + 1 < 8)
							yStone++;
						else
							isPossible = false;
					}
				}
			} else if (str.compareTo("RT") == 0) {
				if (xKing + 1 < 8 && yKing + 1 < 8) {
					xKing++;
					yKing++;

					if (xKing == xStone && yKing == yStone) {
						if (xStone + 1 < 8 && yStone + 1 < 8) {
							xStone++;
							yStone++;
						} else {
							isPossible = false;
						}
					}
				}
			} else if (str.compareTo("LT") == 0) {
				if (0 <= xKing - 1 && yKing + 1 < 8) {
					xKing--;
					yKing++;

					if (xKing == xStone && yKing == yStone) {
						if (0 <= xStone - 1 && yStone + 1 < 8) {
							xStone--;
							yStone++;
						} else {
							isPossible = false;
						}
					}
				}
			} else if (str.compareTo("RB") == 0) {
				if (xKing + 1 < 8 && 0 <= yKing - 1) {
					xKing++;
					yKing--;

					if (xKing == xStone && yKing == yStone) {
						if (xStone + 1 < 8 && 0 <= yStone - 1) {
							xStone++;
							yStone--;
						} else {
							isPossible = false;
						}
					}
				}
			} else if (str.compareTo("LB") == 0) {
				if (0 <= xKing - 1 && 0 <= yKing - 1) {
					xKing--;
					yKing--;

					if (xKing == xStone && yKing == yStone) {
						if (0 <= xStone - 1 && 0 <= yStone - 1) {
							xStone--;
							yStone--;
						} else {
							isPossible = false;
						}
					}
				}
			}

			if (!isPossible) {
				xKing = xKingPrev;
				yKing = yKingPrev;
			}
		}

		// King
		System.out.print((char) ('A' + xKing));
		System.out.println((char) ('1' + yKing));

		// Stone
		System.out.print((char) ('A' + xStone));
		System.out.println((char) ('1' + yStone));
	}
}
