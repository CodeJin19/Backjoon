import java.io.*;

public class Main {

	static int num[];
	static StringBuilder sb = new StringBuilder();

	public static void getPermutation(int toSelect, int[] selected) {
		if (toSelect == selected.length) {
			for (int i = 0; i < selected.length - 1; i++) {
				sb.append((selected[i] + ""));
				sb.append(" ");
			}
			sb.append(selected[selected.length - 1]);
			sb.append("\n");
			return;
		}

		for (int i = 0; i < num.length; i++) {
			selected[toSelect] = num[i];
			getPermutation(toSelect + 1, selected);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n, m;

		str = reader.readLine();
		n = Integer.parseInt(str.split(" ")[0]);
		m = Integer.parseInt(str.split(" ")[1]);

		num = new int[n];

		for (int i = 1; i <= n; i++)
			num[i - 1] = i;

		getPermutation(0, new int[m]);

		System.out.println(sb);
	}
}
