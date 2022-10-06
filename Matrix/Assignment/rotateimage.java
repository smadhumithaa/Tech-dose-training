class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
    public void transpose(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat[0].length;j++){
                int temp=0;
                temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
                
            }
        }
    }
    public void reverse(int[][] mat){
        int n=mat.length;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length/2;j++){
                int tmp = mat[i][j];
                mat[i][j] = mat[i][n - j - 1];
                mat[i][n - j - 1] = tmp;
            }
        }
    }
}
