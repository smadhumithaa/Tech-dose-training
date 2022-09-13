import java.util.Scanner;
public class Main
{
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String str=sc.next();
     int l=0;
  int h=str.length()-1;
  boolean flag=true;
  while(h>l){
    if(str.charAt(l++)!=str.charAt(h--)){
      flag=false;
    }
  }
  if(flag)
  System.out.print("plaindrome");
  else
  System.out.print("Not");
     
}
}
