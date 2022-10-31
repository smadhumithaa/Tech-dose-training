class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> l = new ArrayList<Integer>();
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i], 1);
            }
           // System.out.println(nums[i]+" "+mp.get(nums[i]));
            //System.out.println(mp.get(nums[i])+1);
            mp.replace(nums[i],mp.get(nums[i])+1);
        }
             PriorityQueue<Integer> pq = new PriorityQueue<>((x, y)->{
            int c1 = mp.get(x);
            int c2 = mp.get(y);
            return c2-c1;});
        pq.addAll(mp.keySet());
        int[] result = new int[k];
        int i=0;
        while(!pq.isEmpty() && i<k)
            result[i++]=(int) pq.poll();
        return result;
    }
}
