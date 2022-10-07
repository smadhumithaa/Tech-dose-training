import java.util.Scanner;
class prime{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("Factors are ");
    for(int i=2;i<sqrt(n);i++){
      if(n%i==0)
         System.out.println(i);
    }
    
  }
}
     
