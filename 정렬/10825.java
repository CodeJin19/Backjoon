import java.io.*;
import java.util.*;

public class Main {
	static class Student implements Comparable<Student> {
		public String name;
		public int korean;
		public int english;
		public int math;

		public Student(String name, int korean, int english, int math) {
			super();
			this.name = name;
			this.korean = korean;
			this.english = english;
			this.math = math;
		}

		@Override
		public int compareTo(Student o) {
			if (this.korean == o.korean) {
				if (this.english == o.english) {
					if (this.math == o.math) {
						return this.name.compareTo(o.name);
					} else {
						return o.math - this.math;
					}
				} else {
					return this.english - o.english;
				}
			} else {
				return o.korean - this.korean;
			}
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		Student[] list = new Student[n];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			String name = st.nextToken();
			int korean = Integer.parseInt(st.nextToken());
			int english = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());

			list[i] = new Student(name, korean, english, math);
		}

		Arrays.sort(list);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++)
			sb.append(list[i].name).append("\n");

		System.out.print(sb);

	}
}
