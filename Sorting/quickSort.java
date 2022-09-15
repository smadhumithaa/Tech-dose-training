import java.util.*;
public class Main
{
    public static void countsort(int[] arr) {
        int maxi=Arrays.stream(arr).max().getAsInt();
        int mini=Arrays.stream(arr).min().getAsInt();
        int range=maxi-mini+1;
        int[] freq=new int[maxi+1];
        int[] res=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i=1;i<=freq.length;i++){
            freq[i]+=freq[i-1];
        }
        for(int i=arr.length-1;i>=0;i--){
            res[freq[arr[i]]-1]=arr[i];
            freq[arr[i]]--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(res[i]+" ");
        }
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] arr={ 4, 2, 2, 8, 3, 3, 1};
		countsort(arr);
	}
}
{
    
