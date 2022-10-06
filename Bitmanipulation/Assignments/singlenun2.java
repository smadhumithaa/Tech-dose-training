class Solution {
    public int singleNumber(int[] nums) {
        int ones=0;
int twos=0;
        System.out.println(5&-4);
for(int i:nums)
{ 
System.out.println(ones+"^"+i+"="+(ones^i)+" & "+(~twos)+" "+((ones^i)&(~twos)));
ones=(ones^i)&(~twos);
    System.out.println(twos+"^"+i+"="+(twos^i)+" & "+(~ones)+" "+((twos^i)&(~ones)));
twos=(twos^i)&(~ones);
//System.out.println(twos);
}
return ones;
    }
}
