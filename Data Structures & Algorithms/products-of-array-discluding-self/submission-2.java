class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int []  result= new int[nums.length];
        int [] left= new int[nums.length];
        left[0]=nums[0];
        int [] right= new int[nums.length];
        right[nums.length-1]=nums[nums.length-1];

         
        for(int i=1;i<nums.length;i++){

            left[i]=nums[i]*left[i-1];
        }

        for(int i=nums.length-2;i>=0;i--){
            right[i]=nums[i]*right[i+1];
        }
         result[0]=right[1];
         result[nums.length-1]=left[nums.length-2];
        for(int i=1;i<nums.length-1;i++){
            result[i]=left[i-1]*right[i+1];
        }

        
        return result;

    }
}  
