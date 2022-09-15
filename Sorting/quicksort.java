import java.util.Scanner;
public class am {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int arr[],int low,int high){
        int i=(low-1),j=0;
        int pivot=arr[high];
        for(j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,j);
        return (i+1);

    }
    public static void quicksort(int arr[],int low,int high){
        if(low<high){
            int p=partition(arr,low,high);
            quicksort(arr, low, p-1);
            quicksort(arr,p+1,high);
        }
    }
    public static void main(String args[]){
        int[] arr={10, 7, 8, 9, 1, 5};
        
        quicksort(arr,0,(arr.length-1));
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
