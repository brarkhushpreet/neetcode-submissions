class Solution {

    private int find(int n1,int [] par){
        while(n1!=par[n1]){
            n1=par[n1];
        }
        return n1;
    }

    private boolean union(int n1, int n2,int [] par, int [] rank){
       int p1=find(n1,par);
       int p2= find(n2,par);

       if(p1==p2){
        return false;
       }

       if(rank[p1]>rank[p2]){
        par[p2]=p1;
        rank[p2]+=rank[p1];
       }else{
         par[p1]=p2;
        rank[p1]+=rank[p2];
       }

       return true;


    }

  public boolean validTree(int n, int[][] edges) {

        if(edges.length>n-1){
            return false;
        }

        int [] par= new int[n];
        int [] rank= new int[n];

        for(int i=0;i<n;i++){
            par[i]=i;
            rank[i]=1;
        }

        int comp=n;

        for(int [] edge:edges){
            if(!union(edge[0],edge[1],par,rank)){
                return false;
            }else{
                 
                comp-=1;
            }
        }
        

        return comp==1;
      

    }
}
