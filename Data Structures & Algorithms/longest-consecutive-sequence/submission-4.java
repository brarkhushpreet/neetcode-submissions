class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();

        int max=0; 

        for(int num:nums){
            if(map.containsKey(num)){
                continue;
            }
            int left=map.getOrDefault(num-1,0);
            int right= map.getOrDefault(num+1,0);
            int curr=left+right+1;
            map.put(num,curr);

            map.put(num-left,curr);
            map.put(num+right,curr);
            max=Math.max(max,curr);
        }
        
        return max;
        
    }
}
