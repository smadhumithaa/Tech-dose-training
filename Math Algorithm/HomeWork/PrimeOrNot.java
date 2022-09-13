public class Main{
  public static void main(String args[])
  {
    int n=100;
    boolean f=true;
    for(int i=2; i*i<=n; i++){
        if(n%i == 0){
            f=false;
        }
    }
    if(f)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
   
