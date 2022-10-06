class Solution {
    public int hammingDistance(int x, int y) {
        int z=x^y;
        //System.out.println(z);
        int set=0;
        for(int i=0; i<32; i++){
            //System.out.println(z>>i);
            if(((z>>i)&1 )== 1){
                set++;
            }
        }
        return set;
    }
}
