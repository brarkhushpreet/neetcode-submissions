class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map= new HashMap<>();

        for(int i=0;i<strs.length;i++){
          char [] arr= strs[i].toCharArray();
          Arrays.sort(arr);
          String key = new String(arr);
          map.computeIfAbsent(key,k-> new ArrayList<>()).add(strs[i]);
        }
        List<List<String>> result= new ArrayList<>();

        for(List<String> list:map.values()){
            result.add(list);
        }
        return result;
        
    }
}
