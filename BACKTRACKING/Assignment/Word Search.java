class Solution {
    public boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        int r=board.length;
        int c=board[0].length;
        visited =new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(word.charAt(0)==board[i][j] && searchWord(i,j,board,0,word)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean searchWord(int i, int j,char[][] board,int ind, String word){
        if(ind==word.length())
        return true;
        if(i<0 || i>=board.length || j<0 || j>=board[i].length || word.charAt(ind)!=board[i][j]|| visited[i][j])
        return false;
        visited[i][j]=true;
        if(searchWord(i+1,j,board,ind+1,word)||searchWord(i-1,j,board,ind+1,word)||searchWord(i,j+1,board,ind+1,word)||searchWord(i,j-1,board,ind+1,word))
        return true;
        visited[i][j]=false;
        return false;
    }

}
