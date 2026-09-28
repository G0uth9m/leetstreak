class Solution {
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;
        boolean [][] visited=new boolean [row][col];
        boolean result=false;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==word.charAt(0)){
                    if(result=wordsearch(word,board,visited,i,j,0)){
                        return result;
                    }
                }
            }
        }
        return result;
    }
    static boolean wordsearch(String word,char[][] board,boolean[][] visited,int i,int j,int ind){
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || visited[i][j] || board[i][j]!=word.charAt(ind)){
            return false;
        }
        if(ind==word.length()-1){
            return true;
        }
        visited[i][j]=true;
        if( wordsearch(word,board,visited,i,j-1,ind+1) ||
            wordsearch(word,board,visited,i,j+1,ind+1) ||
            wordsearch(word,board,visited,i-1,j,ind+1) ||
            wordsearch(word,board,visited,i+1,j,ind+1)){
                return true;
        }
        visited[i][j]=false;
        return false;
    }
}