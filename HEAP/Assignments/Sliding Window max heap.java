class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> (o2 - o1));
        int[] arr=new int[nums.length-k+1];
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i-k>=0){
                pq.remove(nums[i-k]);
            }
            pq.offer(nums[i]);
            if(pq.size()==k)
            arr[i-k+1]=pq.peek();
        }
        return arr;
    }
}
