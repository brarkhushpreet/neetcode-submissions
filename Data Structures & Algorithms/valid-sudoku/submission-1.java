class Solution {

    private boolean check(int x, int y, char[][] board){
        for(int i=0;i<board.length;i++ ){
            if(x!=i && board[x][y]==board[i][y]){
                return false;
            }
        }

        for(int i=0;i<board[0].length;i++){
               if(y!=i && board[x][y]==board[x][i]){
                return false;
               }
        }
        int X=x/3*3;
        int Y=y/3*3;
        for(int i=X;i<X+3;i++){
            for(int j=Y;j<Y+3;j++){
                if((x!=i || y!=j) && board[x][y]==board[i][j]){
                    return false;
                }
            }
        }
        return true;

    }

    public boolean isValidSudoku(char[][] board) {

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.' && !check(i,j,board)){
                    return false;    
                }
            }
        }
        return true;

        
    }
}
