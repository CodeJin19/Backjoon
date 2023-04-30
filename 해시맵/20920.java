import java.io.*;
import java.util.*;

public class Main {
	static class Word {
		String name;
		int cnt;
		int len;
		
		Word(String name, int cnt) {
			this.name = name;
			this.cnt = cnt;
			this.len = name.length();
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashMap<String, Integer> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			String str = reader.readLine();
			int len = str.length();
			
			if(m <= len) {
				if(map.containsKey(str)) {
					int val = map.get(str);
					map.put(str, val + 1);
				} else {
					map.put(str, 1);
				}
			}
		}
		
		Word[] list = new Word[map.size()];
		int idx = 0;
		
		for(String str : map.keySet()) {
			Word newWord = new Word(str, map.get(str));
			list[idx++] = newWord;
		}
		
		Arrays.sort(list, new Comparator<Word>() {
			@Override
			public int compare(Word o1, Word o2) {
				if(o1.cnt != o2.cnt) {
					return o2.cnt - o1.cnt;
				} else if(o1.len != o2.len){
					return o2.len - o1.len;
				} else {
					for(int i = 0; i < o1.len; i++) {
						if(o1.name.charAt(i) != o2.name.charAt(i)) {
							return o1.name.charAt(i) - o2.name.charAt(i); 
						}
					}
					
					return 1;
				}
			}
		});
		
		for(int i = 0; i < list.length; i++) {
			sb.append(list[i].name).append("\n");
		}
		
		System.out.print(sb.toString());
	}
}