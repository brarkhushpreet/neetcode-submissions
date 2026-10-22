class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [][] arr= new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }

        Arrays.sort(arr,(a,b)->a[0]-b[0]);

        int i=0;
        int j=nums.length-1;
        while(i<j){
            int left=arr[i][0];
            int right=arr[j][0];
           if(left+right==target){
            return new int[]{Math.min(arr[i][1],arr[j][1]),Math.max(arr[i][1],arr[j][1])};
           } else if(left+right>target){
            j--;
           }else{
            i++;
           }
        }
        return new int[0];


        
    }
}
