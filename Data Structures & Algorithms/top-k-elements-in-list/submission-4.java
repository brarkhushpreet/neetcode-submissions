class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> [] freq= new List[nums.length];
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
            if(freq[count-1]==null){
                freq[count-1]=new ArrayList<>();
            }
            freq[count-1].add(nums[i]);
            
        }
       
        int [] result= new int[k];
        int it=0;
        for(int i=nums.length-1;i>=0;i--){
            if(freq[i]==null){
                continue;
            }
            for(int j=0;j<freq[i].size();j++){
              if(it>=k){
                return result;
            }
            result[it++]=freq[i].get(j);
            }
            
            
            
        }
        return result;
    }
}
