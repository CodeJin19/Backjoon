import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		int[] list = new int[n];
		StringTokenizer st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
        }

		boolean isReverse = true;

		for (int i = 0; i < n - 1; i++) {
			if (list[i] < list[i + 1]) {
				isReverse = false;
				break;
			}
		}

		if (isReverse) {
			System.out.println(-1);
		} else {
			int idx = n - 2;

			while (0 <= idx && list[idx + 1] < list[idx]) {
				idx--;
            }

			boolean[] isUsed = new boolean[n + 1];
			int[] answer = new int[n];
			int ansIdx = 0;
			int numIdx = 1;

			for (; ansIdx < idx; ansIdx++) {
				answer[ansIdx] = list[ansIdx];
				isUsed[list[ansIdx]] = true;
			}

			for (int num = list[idx] + 1; num <= n; num++) {
				if (!isUsed[num]) {
					answer[idx] = num;
					isUsed[num] = true;
					break;
				}
			}

			while (numIdx <= n && isUsed[numIdx]) {
				numIdx++;
			}
			
			ansIdx = idx + 1;

			for (; ansIdx < n; ansIdx++) {
				answer[ansIdx] = numIdx;
				isUsed[numIdx] = true;
				
				while(numIdx <= n && isUsed[numIdx]) {
					numIdx++;
				}
			}	
			
			StringBuilder sb = new StringBuilder();
			sb.append(answer[0]);
			for(int i = 1; i < n; i++) {
				sb.append(" ").append(answer[i]);
            }
			
			System.out.println(sb);
			
		}
	}
}
