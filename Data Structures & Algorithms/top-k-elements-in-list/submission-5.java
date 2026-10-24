class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int []> q= new PriorityQueue<>((a,b)->a[0]-b[0]);
        Set<Integer> done= new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(done.contains(nums[i])){
                continue;
            }
            int count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            done.add(nums[i]);
           q.add(new int[]{count,nums[i]});
           if(q.size()>k){
            q.remove();
           }
            
        }
       
        int [] result= new int[k];
         for(int i=0;i<k;i++){
            result[i]=q.poll()[1];
         }
        return result;
    }
}
