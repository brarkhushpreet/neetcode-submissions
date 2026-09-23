class Solution {

    private int find(int n1,int [] par){
        while(n1!=par[n1]){
            n1=par[n1];
        }
        return n1;
    }

    private int union(int n1, int n2,int [] par, int [] rank){
       int p1=find(n1,par);
       int p2= find(n2,par);

       if(p1==p2){
        return 0;
       }

       if(rank[p1]>rank[p2]){
        par[p2]=p1;
        rank[p2]+=rank[p1];
       }else{
         par[p1]=p2;
        rank[p1]+=rank[p2];
       }

       return 1;


    }

    public int countComponents(int n, int[][] edges) {

        int [] par= new int[n];
        int [] rank= new int[n];

        for(int i=0;i<n;i++){
            par[i]=i;
            rank[i]=1;
        }

        int result=n;

        for(int [] edge:edges){
            result-=union(edge[0],edge[1],par,rank);
        }
        return result;

    }
}
