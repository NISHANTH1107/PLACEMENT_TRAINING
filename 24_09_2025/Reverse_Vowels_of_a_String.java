import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        Set<Character> vowels = new HashSet<>(Arrays.asList(
            'a','e','i','o','u','A','E','I','O','U'
        ));
        while(left<right){
            if(!vowels.contains(arr[left])){
                left++;
                continue;
            }
            if(!vowels.contains(arr[right])){
                right--;
                continue;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
            
        }
        return new String(arr);
    }
}