class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [][] arr= new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr,(a, b) -> Integer.compare(a[0], b[0]));

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(arr[i][0]+arr[j][0]==target){
                    return new int[]{Math.min(arr[i][1],arr[j][1]),Math.max(arr[i][1],arr[j][1])};
                }
                 if(arr[i][0]+arr[j][0]>target){
                    break;
                 }
            }
        }
        return new int[]{};
    }
}
