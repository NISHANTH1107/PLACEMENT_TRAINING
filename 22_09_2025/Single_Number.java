class Solution {
    public int singleNumber(int[] nums) {
        int index = 0;
        for(int n:nums){
            index = index ^ n; //XOR
        }
        return index;
    }   
}

//XOR - logic
//a^a=0
//a^0=a