import java.io.*;
import java.util.*;

public class Main {
	static class Tree implements Comparable<Tree> {
		public int height;
		public int growthRate;

		public Tree(int height, int growthRate) {
			super();
			this.height = height;
			this.growthRate = growthRate;
		}

		@Override
		public int compareTo(Main.Tree o) {
			if (this.growthRate == o.growthRate)
				return this.height - o.height;
			else
				return this.growthRate - o.growthRate;
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		StringTokenizer stTrees = new StringTokenizer(reader.readLine());
		StringTokenizer stGrowthRates = new StringTokenizer(reader.readLine());
		Tree[] trees = new Tree[n];

		for (int i = 0; i < n; i++)
			trees[i] = new Tree(Integer.parseInt(stTrees.nextToken()), Integer.parseInt(stGrowthRates.nextToken()));

		Arrays.sort(trees);

		long total = 0;

		for (int i = 0; i < n; i++) {
			long tmp = trees[i].growthRate;
			tmp *= i;
			tmp += trees[i].height;

			total += tmp;
		}

		System.out.println(total);
	}
}
