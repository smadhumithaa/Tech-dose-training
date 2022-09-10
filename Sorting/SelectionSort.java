import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<num-1;i++)
		{
		    int Ind=i;
		    for(int j=i+1;j<num;j++)
		    {
		        if(a[Ind] > a[j])
		        {
		            Ind=j;
		        }
		    }
		    int temp = arr[Ind];
		    arr[Ind] = arr[i];
		    arr[i] = temp;
		}
		for(int i=0;i<num;i++)
		{
		    System.out.println(arr[i]);
		}
	}
}
