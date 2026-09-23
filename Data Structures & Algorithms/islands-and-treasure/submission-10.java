class Solution {
   
    private int[][] directions = {{0,1}, {1,0}, {-1,0}, {0,-1}};

    private int bfs(int [][]grid,int i,int j, int m, int n,Set<Integer> visited){

        Queue<int []> q= new LinkedList<>();
        q.add(new int[]{i,j,0});
        visited.add(i*n+j);
        while(!q.isEmpty()){
            int [] temp=q.remove();
            int x=temp[0];
            int y=temp[1];
            int distance=temp[2];

            if(grid[x][y]==0){
                return distance;
            }

            for(int [] direction:directions){
                int newX=x+direction[0];
                int newY=y+direction[1];
                if(newX>=0 && newY>=0 && newX<m && newY<n && grid[newX][newY]!=-1 &&!visited.contains(newX*n+newY)){
                    visited.add(newX*n+newY);
                    q.add(new int[]{newX,newY,distance+1});
                }
            }
        }
        return Integer.MAX_VALUE-1;

    }
    public void islandsAndTreasure(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0 && grid[i][j]!=-1){
                    grid[i][j]=bfs(grid,i,j,m,n,new HashSet<>());
              
                }
            }
        }
        
    }
}
