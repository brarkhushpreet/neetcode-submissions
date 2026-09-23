class Solution {
    private int [][] directions={{0,1},{1,0},{-1,0},{0,-1}};
    private int INF=Integer.MAX_VALUE;
    public void islandsAndTreasure(int[][] grid) {

        Queue<int []> q= new LinkedList<>();

        int m=grid.length;
        int n=grid[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                q.add(new int[]{i,j});
                }
            }
        }

        while(!q.isEmpty()){
            int [] temp=q.remove();
            int x= temp[0];
            int y=temp[1];

            for(int [] direction:directions){
                int newX= x+direction[0];
                int newY= y+direction[1];

                if(newX>=0 && newY>=0 && newX<m && newY<n && grid[newX][newY]==INF){
                    q.add(new int[]{newX,newY});
                    grid[newX][newY]=1+grid[x][y];
                }
            }

        }
        
    }
}
