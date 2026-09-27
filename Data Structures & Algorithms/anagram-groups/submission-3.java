class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map= new HashMap<>();


        for(int i=0;i<strs.length;i++){
            int [] temp= new int[26];
            for(int j=0;j<strs[i].length();j++){
                 temp[strs[i].charAt(j)-'a']++;
            }
            String key= Arrays.toString(temp);

            map.computeIfAbsent(key,k-> new ArrayList()).add(strs[i]);
        }
        List<List<String>> result= new ArrayList<>(map.values());
        return result;
    }
}
