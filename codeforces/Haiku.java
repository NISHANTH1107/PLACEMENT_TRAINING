
import java.util.*;

class Main {
    
    public static boolean check575(String s1, String s2, String s3) {
        // Inline vowel counting
        int c1 = 0, c2 = 0, c3 = 0;
        for (char ch : s1.toLowerCase().toCharArray())
            if ("aeiou".indexOf(ch) != -1) c1++;
        for (char ch : s2.toLowerCase().toCharArray())
            if ("aeiou".indexOf(ch) != -1) c2++;
        for (char ch : s3.toLowerCase().toCharArray())
            if ("aeiou".indexOf(ch) != -1) c3++;

        return c1 == 5 && c2 == 7 && c3 == 5;
    }
    public static void main(String[] args) {
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        System.out.println(check575(s1, s2, s3));
    }
}