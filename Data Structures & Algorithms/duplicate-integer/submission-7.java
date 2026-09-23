class Solution {
    public boolean hasDuplicate(int[] nums) {
      Hashtable<Integer,Integer> map= new Hashtable<>();


      for(int num:nums){
        if(map.containsKey(num)){
            return true;
        }
        map.put(num,1);
      }
      return false;
    }
}