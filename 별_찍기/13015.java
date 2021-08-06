import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());

		StringBuilder line = new StringBuilder();
		int mid = (num - 1) * 2 - 1;

		for (int i = 0; i < num; i++)
			line.append("*");

		for (int i = 0; i < mid; i++)
			line.append(" ");
		mid -= 2;

		for (int i = 0; i < num; i++)
			line.append("*");

		line.append("\n");

		for (int i = 1; i < num - 1; i++) {
			for (int j = 0; j < i; j++)
				line.append(" ");

			line.append("*");

			for (int j = 0; j < num - 2; j++)
				line.append(" ");

			line.append("*");

			for (int j = 0; j < mid; j++)
				line.append(" ");
			mid -= 2;

			line.append("*");

			for (int j = 0; j < num - 2; j++)
				line.append(" ");

			line.append("*");

			line.append("\n");
		}

		for (int i = 1; i < num; i++)
			line.append(" ");

		line.append("*");

		for (int i = 0; i < num - 2; i++)
			line.append(" ");

		line.append("*");

		for (int i = 0; i < num - 2; i++)
			line.append(" ");

		line.append("*").append("\n");

		mid = 1;

		for (int i = num - 2; 0 < i; i--) {
			for (int j = 0; j < i; j++)
				line.append(" ");

			line.append("*");

			for (int j = 0; j < num - 2; j++)
				line.append(" ");

			line.append("*");

			for (int j = 0; j < mid; j++)
				line.append(" ");
			mid += 2;

			line.append("*");

			for (int j = 0; j < num - 2; j++)
				line.append(" ");

			line.append("*");

			line.append("\n");
		}

		for (int i = 0; i < num; i++)
			line.append("*");

		for (int i = 0; i < mid; i++)
			line.append(" ");
		mid -= 2;

		for (int i = 0; i < num; i++)
			line.append("*");

		line.append("\n");

		System.out.println(line);
	}
}
