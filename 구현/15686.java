import java.io.*;
import java.util.*;

public class Main {

	public static int getChicken(ArrayList<int[]> house, ArrayList<int[]> chicken) {
		int houseLen = house.size();
		int chickenLen = chicken.size();
		int min, len, sum = 0;

		for (int i = 0; i < houseLen; i++) {
			min = 2112345678;

			for (int j = 0; j < chickenLen; j++) {
				len = Math.abs(house.get(i)[0] - chicken.get(j)[0]) + Math.abs(house.get(i)[1] - chicken.get(j)[1]);
				
				if(len < min)
					min = len;
			}
			
			sum += min;
		}

		return sum;
	}

	public static int getComb(int toSelect, int startIdx, int list[], ArrayList<int[]> house,
			ArrayList<int[]> chicken) {

		if (toSelect == list.length) {
			ArrayList<int[]> newChicken = new ArrayList<int[]>();

			for (int i = 0; i < toSelect; i++)
				newChicken.add(chicken.get(list[i]));

			return getChicken(house, newChicken);
		}

		int ret = 2112345678;

		for (int i = startIdx; i < chicken.size(); i++) {
			list[toSelect] = i;
			ret = Math.min(ret, getComb(toSelect + 1, i + 1, list, house, chicken));
		}

		return ret;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		StringTokenizer st;
		ArrayList<int[]> house = new ArrayList<int[]>();
		ArrayList<int[]> chicken = new ArrayList<int[]>();
		int fld[][];
		int tmp[];
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);

		fld = new int[N][N];

		for (int i = 0; i < N; i++) {
			str = reader.readLine();
			st = new StringTokenizer(str);

			for (int j = 0; j < N; j++) {
				fld[i][j] = Integer.parseInt(st.nextToken());

				if (fld[i][j] == 1) {
					tmp = new int[2];
					tmp[0] = i;
					tmp[1] = j;
					house.add(tmp);
				} else if (fld[i][j] == 2) {
					tmp = new int[2];
					tmp[0] = i;
					tmp[1] = j;
					chicken.add(tmp);
				}
			}
		}

		if (chicken.size() == M) {
			System.out.println(getChicken(house, chicken));
		} else {
			System.out.println(getComb(0, 0, new int[M], house, chicken));
		}
	}
}
