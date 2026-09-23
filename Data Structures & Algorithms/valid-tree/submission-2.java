class Solution {

    private boolean dfs(List<List<Integer>> graph,int start, Set<Integer> visited,int parent){
          
             visited.add(start);
             List<Integer> nei= graph.get(start);
            for(int node: nei ){

                if(node==parent) continue;
                 if(visited.contains(node)){
                    return false;
                 }
                dfs(graph,node,visited ,start);
                
                
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

        if(!dfs(graph,0,visited,-1)){
            System.out.println("here");
               return false;
        }
         System.out.println("here2");
         System.out.println(visited.toString());
       return visited.size()==n;


          
    }
}

