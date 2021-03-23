import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		String str;
		String tmp[];
		int n, t, sex, num, diff;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(reader.readLine());
		int light[] = new int[n + 1];
		
		str = reader.readLine();
		tmp = str.split(" ");

		light[0] = 0;

		for (int i = 1; i <= n; i++) {
			light[i] = Integer.parseInt(tmp[i - 1]);
		}

		str = reader.readLine();
		t = Integer.parseInt(str);

		for (int i = 0; i < t; i++) {
			str = reader.readLine();
			tmp = str.split(" ");
			sex = Integer.parseInt(tmp[0]);
			num = Integer.parseInt(tmp[1]);
			
			if (sex == 1) {
				for (int j = 1; j <= n; j++)
					if (j % num == 0)
						light[j] = light[j] ^ 1;
			} else {
				diff = 0;

				while (1 <= num - diff && num + diff <= n) {
					if (light[num - diff] != light[num + diff])
						break;
					diff++;
				}

				for (int j = num - diff + 1; j < num + diff; j++) {
					light[j] = light[j] ^ 1;
				}
			}
		}

		System.out.print(light[1]);

		for (int i = 2; i <= n; i++) {
			if (i % 20 == 1)
				System.out.print("\n" + light[i]);
			else
				System.out.print(" " + light[i]);
		}
	}
}
