class Solution {
    private LinkedList<String> res;
    private boolean[][] visited;
    public List<String> findWords(char[][] board, String[] words) {
        int r=board.length;
        int c=board[0].length;
        res=new LinkedList<>();
        
        //int a=0;
        for(int a=0;a<words.length;a++){
            visited=new boolean[r][c];
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    String s=words[a];
                    if(s.charAt(0)==board[i][j] && searchWord(i,j,0,a,board,words))
                    res.add(s);
                }
            }
        }
        List<String> newList = res.stream()
                                      .distinct()
                                      .collect(Collectors.toList());
        return newList;
    }
    private boolean searchWord(int i,int j, int ind,int wrdind,char[][] board, String[] words)
    {
        if(words[wrdind].length()==ind)
        return true;
        if(i<0 || i>=board.length || j<0 || j>=board[i].length || visited[i][j] || words[wrdind].charAt(ind)!=board[i][j])
        return false;
        visited[i][j]=true;
        if(searchWord(i+1,j,ind+1,wrdind,board,words)||searchWord(i-1,j,ind+1,wrdind,board,words)||searchWord(i,j+1,ind+1,wrdind,board,words)||searchWord(i,j-1,ind+1,wrdind,board,words))
        return true;
        visited[i][j]=false;
        return false;
    }
}
