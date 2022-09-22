import java.io.*;
import java.util.*;
 
class Main {
  public static void main(String args[]){
    int arr1[]={1,5,9,10,15,20};
    int arr2[]={2,3,8,13};
    int m=arr1.length,n=arr2.length;
    merge(arr1,m,arr2,n);
    for(int i: arr1)
      System.out.print(i+" ");
    for(int i:arr2)
      System.out.print(i+" ");
    
  }
  static void merge(int[] arr1,int m,int[] arr2,int n){
    for(int i=n-1;i>=0;i--){
      int j, l=arr1[m-1];
      for(j=m-2;j>=0 && arr1[j]>arr2[i];j--)
        arr1[j+1]=arr1[j];
      if(j!=m-2 || l>arr2[i]){
        arr1[j+1]=arr2[i];
        arr2[i]=l;
      }
    }
  }
}
  
