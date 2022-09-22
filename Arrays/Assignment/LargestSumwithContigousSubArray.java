import java.io.*;
import java.util.*;
 
class solution {
  public static void main(String args[]){
    int[] arr={ -2, -3, 4, -1, -2, 1, 5, -3 };
    int m=maxsubarr(arr);
    System.out.println(m);
  }
  public static int maxsubarr(int[] arr){
    int n=arr.length;
    int max=Integer.MIN_VALUE,current=0;
    for(int i=0;i<n;i++){
      current=current+arr[i];
      if(max<current)
        max=current;
      if(current<0)
        current=0;
    }
    return max;
  }
}
