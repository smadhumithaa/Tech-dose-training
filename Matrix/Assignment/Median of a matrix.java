import java.util.*;
 class median {
    public static int smallmidcount(int[]  A, int mid, int n) {
      int l = 0, h = n - 1;
      while (l <= h) {
        int md = (l + h) >> 1;
        if (A[md] <= mid) {
          l = md + 1;
        } else {
          h = md - 1;
        }
      }
      return l;
    }
   
    public static void main(String args[]) {
      int row, col;
      Scanner scan = new Scanner(System.in);
   // entering the row, col and element of matrix respectively. 
      System.out.print("Enter the number of rows size of the matrix");
      row = scan.nextInt(); 
      System.out.print("Enter the number of columns size of the matrix");
      col = scan.nextInt(); 
      int [][]A=new int[row][col];
        System.out.println("Enter all the elements of matrix");
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < col; j++) 
            {
                A[i][j] = scan.nextInt();
            }
        }
// finding the median of the matrix.
      int low = 1;
      int high = 1000000000;
      int n = row;
      int m = col;
      while (low <= high) {
        int mid = (low + high) >> 1;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
          cnt += smallmidcount(A[i], mid, col);
        }
        if (cnt <= (n * m) / 2)
          low = mid + 1;
        else
          high = mid - 1;
      }
      System.out.println("Median of the row-wise sorted matrix is "+ low);
    }
  }
