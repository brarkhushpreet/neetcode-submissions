class Solution {

    private boolean bfs(List<List<Integer>> graph,int start, Set<Integer> visited){
        Queue<int []> q= new LinkedList<>();

        q.add(new int[]{start,-1});
         visited.add(start);
      
        while(!q.isEmpty()){
            int [] temp= q.remove();
            int tempnode=temp[0];
            int parent=temp[1];
             List<Integer> nei= graph.get(tempnode);
            for(int node: nei ){

                if(node==parent) continue;
                 if(visited.contains(node)){
                    return false;
                 }
                 visited.add(node);
                 q.add(new int[]{node,tempnode});
                
            }

        }
        return true;
    }
    public boolean validTree(int n, int[][] edges) {
          if(edges.length>n-1){
            return false;
          }

          Set<Integer> visited= new HashSet();

          List<List<Integer>> graph= new ArrayList();

          for(int i=0;i<n;i++){
            graph.add(new ArrayList());
          }
          for(int [] edge:edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
          }

        if(!bfs(graph,0,visited)){
            System.out.println("here");
               return false;
        }
         System.out.println("here2");
         System.out.println(visited.toString());
       return visited.size()==n;


          
    }
}

