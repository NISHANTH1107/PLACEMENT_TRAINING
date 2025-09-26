class Solution {
    public char findTheDifference(String s, String t) {
        int sum_s = 0, sum_t = 0;
        for(char c : s.toCharArray()){sum_s += c;}
        for(char c : t.toCharArray()){sum_t += c;}
        return (char)(sum_t - sum_s);
    }
}