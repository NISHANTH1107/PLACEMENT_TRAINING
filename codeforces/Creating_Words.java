import java.util.*;

public class Creating_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i =0; i<t; i++){
        String s = sc.nextLine();
        // String first1 = s.substring(0, 1);
        // String first2 = s.substring(4, 5);
        
        String word = s.substring(4, 5)+ s.substring(1,4) + s.substring(0, 1) + s.substring(5);
        System.out.println(word);
        }
        
    }
}