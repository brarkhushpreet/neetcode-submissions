class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [][] arr= new int[nums.length][2];
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
            arr[i][0]=nums[i];
            arr[i][1]=count;
        }
        Arrays.sort(arr,(a,b)->b[1]-a[1]);
        int [] result= new int[k];
        for(int i=0;i<k;i++ ){
            result[i]=arr[i][0];
        }
        return result;
    }
}
