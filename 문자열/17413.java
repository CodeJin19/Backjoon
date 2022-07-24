import java.io.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        StringBuilder sb = new StringBuilder();
        int len = line.length();

        for(int i = 0; i < len; i++) {
            if(line.charAt(i) == '<') {
                while(line.charAt(i) != '>') {
                    sb.append(line.charAt(i));
                    i++;
                }

                sb.append(line.charAt(i));
            } else if(line.charAt(i) != ' '){
                StringBuilder word = new StringBuilder();

                while(i < len && line.charAt(i) != ' ' && line.charAt(i) != '<') {
                    word.append(line.charAt(i));
                    i++;
                }

                sb.append(word.reverse());

                if(i < len)
                    i--;
            } else if(line.charAt(i) == ' ') {
                sb.append(' ');
            }
        }

        System.out.println(sb.toString());
    }
}
