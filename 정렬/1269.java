import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		int aLen = Integer.parseInt(st.nextToken());
		int bLen = Integer.parseInt(st.nextToken());

		int[] arr = new int[aLen];
		int[] brr = new int[bLen];

		st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < aLen; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(reader.readLine());

		for (int i = 0; i < bLen; i++)
			brr[i] = Integer.parseInt(st.nextToken());

		Arrays.sort(arr);
		Arrays.sort(brr);

		int aIdx = 0;
		int bIdx = 0;
		int cnt = 0;

		while (aIdx < aLen && bIdx < bLen) {
			if (arr[aIdx] == brr[bIdx]) {
				aIdx++;
				bIdx++;
			} else if (arr[aIdx] < brr[bIdx]) {
				cnt++;
				aIdx++;
			} else {
				cnt++;
				bIdx++;
			}
		}

		if (aIdx < aLen)
			cnt += (aLen - aIdx);

		if (bIdx < bLen)
			cnt += (bLen - bIdx);

		System.out.println(cnt);
	}
}
