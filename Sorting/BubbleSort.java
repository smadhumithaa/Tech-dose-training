import java.util.Scanner;
public Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int arr[]=new int[num];
    for(int i=0;i<num;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(int i=num-1;i>0;--i)
    {
      isSwapped=false;
      for(int j=0;j<i;j++)
      {
        if(arr[j]>arr[j+1])
        {
          int temp=arr[j];
          arr[j]=arr[j+];
          arr[j+]=temp;
        }
      }
      if(isSwapped==false)
        break;
    }
    for(int i=0;i<num;i++)
    {
      System.out.println(arr[i]);
    }
  }
}
