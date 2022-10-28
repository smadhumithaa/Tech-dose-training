class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[]  arr=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                    if(j==m-1)
                        arr[i]=-1;
                    else 
                    {
                        int f=0;
                        for(int k=j+1;k<m;k++){
                            if(nums2[j]<nums2[k]){
                                f=1;
                                arr[i]=nums2[k];
                                break;
                            }
                        }
                        if(f==0)
                            arr[i]=-1;
                        
                    }
                }
            }
        }
        return arr;
    }
}
