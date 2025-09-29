import java.util.*;

public class Love_Story {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 

        String target = "codeforces";
        int[] results = new int[t]; 
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine().trim();
            int diff = 0;
            for (int j = 0; j < 10; j++) {
                if (s.charAt(j) != target.charAt(j)) {
                    diff++;
                }
            }
            results[i] = diff;
        }

        for (int res : results) {
            System.out.println(res);
        }
        
        sc.close();
    }
}
