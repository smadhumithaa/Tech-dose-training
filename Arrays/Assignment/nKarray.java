import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Hello World");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] freq=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    freq[i]=1;
		}
		int k=sc.nextInt();
		
		for(int i=0;i<arr.length;i++){
		    for(int j=i+1;j<arr.length;j++){
		        if(arr[i]==arr[j]){
		            System.out.println("0");
		            freq[i]++;
		            freq[j]++;
		        }
		    }
		}
		/*for(int i=0;i<arr.length;i++)
		System.out.println(freq[i]);*/
		Set<Integer> hash_Set = new HashSet<Integer>();
		 for(int i=0;i<n;i++){
		     if(freq[i]==n/k){
		         hash_Set.add(arr[i]);
		     }
		 }
		 System.out.println(hash_Set);
	}
}
