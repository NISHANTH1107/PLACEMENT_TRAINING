package codeforces;
import java.util.*;

public class Replace_ab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        char[] arr = s.toCharArray();
        int ops = 0;

        for (int i = 0; i < n; i += 2) {
            if (arr[i] == arr[i + 1]) {
                ops++;
                arr[i] = 'a';
                arr[i + 1] = 'b';
            }
        }

        System.out.println(ops);
        System.out.println(new String(arr));

        sc.close();
    }
}
