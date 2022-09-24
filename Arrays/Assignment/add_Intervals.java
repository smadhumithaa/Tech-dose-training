class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for(int[] l: intervals){
            if(merged.isEmpty() || merged.getLast()[1]<l[0]){
                merged.add(l);
            }
            else{
                merged.getLast()[1]=Math.max(merged.getLast()[1],l[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
        }
}
