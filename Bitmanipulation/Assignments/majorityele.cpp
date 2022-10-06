class Solution {
    public int majorityElement(int[] nums) {
        int ans=0;
        int count=0;
        for(int i=0;i<32;i++){
            count=0;
            for(int j=0;j<nums.length;j++)
            {
                if((nums[j] & (1<<i))!=0)
                    count++;
            }
            if(count>nums.length/2)
            {
                ans+=(1<<i);
            }
        }
        return ans;
    }
}
