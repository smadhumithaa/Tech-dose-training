class Solution {
    public int singleNumber(int[] nums) {
        int sing=0;
        for(int i=0;i<nums.length;i++){
            sing=sing^nums[i];
        }
        return sing;
    }
}
