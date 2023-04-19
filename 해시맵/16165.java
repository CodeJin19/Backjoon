import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		
		//0일 경우 팀의 이름이 주어지며, 1일 경우 멤버의 이름이 주어진다.
		HashMap<String, String[]> typeZero = new HashMap<String, String[]>();
		HashMap<String, String> typeOne = new HashMap<String, String>();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			String groupName = reader.readLine();
			String memberName;
			String[] memberList;
			
			int num = Integer.parseInt(reader.readLine());
			memberList = new String[num];
			
			for(int j = 0; j < num; j++) {
				memberName = reader.readLine();
				typeOne.put(memberName, groupName);
				memberList[j] = memberName;
			}
			
			Arrays.sort(memberList);
			
			typeZero.put(groupName, memberList);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < M; i++) {
			String quiz = reader.readLine();
			String type = reader.readLine();
			
			if(type.charAt(0) == '0') {
				String[] memberList = typeZero.get(quiz);
				
				for(int j = 0; j < memberList.length; j++) {
					sb.append(memberList[j]).append("\n");
				}
			} else {
				sb.append(typeOne.get(quiz)).append("\n");
			}
		}
		
		System.out.println(sb.toString());
	}
}