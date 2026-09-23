class Solution {

    private void dfs(List<List<Integer>> graph,int start, Set<Integer> visited,int parent){
          
             visited.add(start);
             List<Integer> nei= graph.get(start);
            for(int node: nei ){

                if(node==parent) continue;
                 if(visited.contains(node)) continue;
                dfs(graph,node,visited ,start);
                
                
            }

       
    }
   public int countComponents(int n, int[][] edges) {
          

          Set<Integer> visited= new HashSet();

          List<List<Integer>> graph= new ArrayList();

          for(int i=0;i<n;i++){
            graph.add(new ArrayList());
          }
          for(int [] edge:edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
          }
          int result=0;
          for(int i=0;i<n;i++){
            if(!visited.contains(i)){
                dfs(graph,i,visited,-1);
                result++;
            }
          }

          return result;


          
    }
}

