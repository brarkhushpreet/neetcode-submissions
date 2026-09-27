class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map= new HashMap<>();


        for(int i=0;i<strs.length;i++){
            char [] temp= strs[i].toCharArray();
            Arrays.sort(temp);
            String key= new String(temp);

            map.computeIfAbsent(key,k-> new ArrayList()).add(strs[i]);
        }
        List<List<String>> result= new ArrayList<>(map.values());
        return result;
    }
}
