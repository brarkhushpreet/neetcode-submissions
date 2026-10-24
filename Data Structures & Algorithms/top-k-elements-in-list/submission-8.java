class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int []> q= new PriorityQueue<>((a,b)->b[0]-a[0]);
        Map<Integer,Integer> map= new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            q.add(new int[]{entry.getValue(),entry.getKey()});
           
        }

       
        int [] result= new int[k];
         for(int i=0;i<k;i++){
            result[i]=q.remove()[1];
         }
        return result;
    }
}
