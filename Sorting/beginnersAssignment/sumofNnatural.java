import java.util.Scanner;
public class Main
{
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int count=0;
     for(int i=0;i<=n;i++){
         count=count+i;
     }
     System.out.println(count);
 }
}
