class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[][] = new int[nums.length][2];

        for(int i=0;i<nums.length;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);

        for(int i=0;i<arr.length;i++){
            int comp= target-arr[i][0];

            int left=i+1;
            int right=arr.length-1;
            while(left<=right){
                int mid= left+(right-left)/2;
                 if(arr[mid][0]==comp){
                    return new int[]{Math.min(arr[mid][1],arr[i][1]),Math.max(arr[mid][1],arr[i][1])};
                 }
                 else if(arr[mid][0]>comp){
                    right=mid-1;
                 }else{
                    left=mid+1;
                 }
            }
        }
        return new int[0];
        
    }
}
