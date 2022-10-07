import java.util.Scanner;
class prime{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n==1 || n%2==0)
      System.out.println("No");
    for(int i=2;i<sqrt(n);i++){
      if(n%i==0)
      {
         System.out.println("No");
        break;}
    }
     System.out.println("Yes");
  }
}
        
