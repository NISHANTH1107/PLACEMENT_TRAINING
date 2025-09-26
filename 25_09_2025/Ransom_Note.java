class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length())     {return false;}
        // HashMap <Character, Integer> map = new HashMap<>();

        // for(char c: magazine.toCharArray())
        // {
        //     map.put(c, map.getOrDefault(c, 0)+1);
        // }

        // for(char ch: ransomNote.toCharArray())
        // {
        //     if(map.containsKey(ch)&&map.get(ch)>0)
        //     {
        //         map.put(ch,map.get(ch)-1);
        //     }
        //     else    return false;
        // }
        // return true;

        int[] count = new int[26];
        for(char c : magazine.toCharArray()){
            count[c - 'a']++;
        }
        for(char ch : ransomNote.toCharArray()){
            if(--count[ch - 'a'] < 0){
                return false;
            }
        }return true;
    }
}