class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> [] rows= new HashSet[9];
        Set<Character> [] cols= new HashSet[9];
        Set<Character> [] boxes= new HashSet[9];
       for (int i = 0; i < 9; i++) {
    rows[i] = new HashSet<>();
    cols[i] = new HashSet<>();
    boxes[i] = new HashSet<>();
}

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                char curr=board[i][j];

                if(curr=='.'){
                    continue;
                }
                  int box = (i / 3) * 3 + (j / 3);

                if(rows[i].contains(curr)|| cols[j].contains(curr)|| boxes[box].contains(curr)){
                    return false;
                }
                rows[i].add(curr);
                cols[j].add(curr);
                boxes[box].add(curr);

                
            }
        }
        return true;
        
    }
}
