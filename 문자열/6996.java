import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    private static boolean solveAnagrams(String first, String second ) {
        int len1 = first.length();
        int len2 = second.length();

        if (len1 == len2) {
            int data1[] = new int[26];
            int data2[] = new int[26];

            for (int i = 0; i < len1; i++) {
                int x = first.charAt(i) - 'a';
                data1[x] += 1;
            }

            for (int i = 0; i < len2; i++) {
                int x = second.charAt(i) - 'a';
                data2[x] += 1;
            }
            
            for (int i = 0; i < 26; i++) {
                if (data1[i] != data2[i]) {
                    return false;
                }
            }
        } else {
            return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
        }
    }
}
