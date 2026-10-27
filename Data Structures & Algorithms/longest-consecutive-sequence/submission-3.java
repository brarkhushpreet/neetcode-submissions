class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<>();
        Set<Integer> see= new HashSet<>();

        for(int num:nums){
            set.add(num);
        }
        int max=0;

        for(int num:nums){
            if(see.contains(num)){
                continue;
            }
            int count=1;
            see.add(num);
            while(set.contains(num+count)){
                see.add(num+count);
                 count++;
            }
            max=Math.max(max,count);
            
        }
        return max;
        
    }
}
