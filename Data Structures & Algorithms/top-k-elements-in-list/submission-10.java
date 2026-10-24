class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int []> q= new PriorityQueue<>((a,b)->a[0]-b[0]);
        Map<Integer,Integer> map= new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            q.add(new int[]{entry.getValue(),entry.getKey()});
            if(q.size()>k){
                q.remove();
            }
        }

       
        int [] result= new int[k];
         for(int i=0;i<k;i++){
            result[i]=q.remove()[1];
         }
        return result;
    }
}
