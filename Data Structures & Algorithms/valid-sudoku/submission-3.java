class Solution {
    public boolean isValidSudoku(char[][] board) {
     int [] rows= new int[9];
     int [] cols= new int[9];
     int [] boxes= new int[9];

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                char curr=board[i][j];

                if(curr=='.'){
                    continue;
                }
                  int box = (i / 3) * 3 + (j / 3);

                 int mask=1<<((curr-'0')-1);
                 if((mask &rows[i])!=0 ||(mask & cols[j])!=0 || (mask & boxes[box])!=0){
                    return false;
                 }
                 rows[i]|=mask;
                 cols[j]|=mask;
                 boxes[box]|=mask;

                
            }
        }
        return true;
        
    }
}
