import java.util.*;
class Main {
    static int max(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
 
    static void countSort(int arr[], int n, int exp)
    {
        int res[] = new int[n]; // output array
        int i;
        int freq[] = new int[10];
        Arrays.fill(res, 0);
      
        for (i = 0; i < n; i++)
            res[(arr[i] / exp) % 10]++;

        for (i = 1; i < 10; i++)
            res[i] += res[i - 1];
      
        for (i = n - 1; i >= 0; i--) {
            output[res[(arr[i] / exp) % 10] - 1] = arr[i];
            res[(arr[i] / exp) % 10]--;
        }
        for (i = 0; i < n; i++)
            arr[i] = res[i];
    }

    static void radixsort(int arr[], int n)
    {
        int m = max(arr, n);
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }
    static void print(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
 
    public static void main(String[] args)
    {
        int arr[] = { 45,203,12,3,95,84,214};
        int n = arr.length;
        radixsort(arr, n);
        print(arr, n);
    }
}
