package codeforces;

import java.util.*;

public class New_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 

        String[] inputs = new String[t];
        for (int i = 0; i < t; i++) {
            inputs[i] = sc.nextLine();
        }
        sc.close();

        for (String s : inputs) {
            if (canRearrange(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean canRearrange(String s) {
        int n = s.length();
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int maxFreq = 0;
        for (int f : freq) {
            maxFreq = Math.max(maxFreq, f);
        }

        if (maxFreq > (n + 1) / 2) {
            return false;
        }

        int distinct = 0;
        for (int f : freq) {
            if (f > 0) distinct++;
        }
        if (distinct == 1) return false;

        return true;
    }
}
