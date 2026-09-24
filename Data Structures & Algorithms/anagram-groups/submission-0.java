class Solution {
    private boolean isAnagram(String s, String t){
      if(s.length()!=t.length()){
        return false;
      }
      int [] map= new int[26];
      for(int i=0;i<s.length();i++){
        char CharS=s.charAt(i);
        char CharT=t.charAt(i);

        map[CharS-'a']++;
        map[CharT-'a']--;
      }
      for(int i=0;i<26;i++){
        if(map[i]!=0){
            return false;
        }
      }
      return true;

    }
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> list= new ArrayList<>();
        int [] log = new int[strs.length];

        for(int i=0;i<strs.length;i++){
            if(log[i]==-1){
                continue;
            }
            List<String> ls= new ArrayList<>();
            ls.add(strs[i]);
            log[i]=-1;
            for(int j=i+1;j<strs.length;j++){
                if(isAnagram(strs[i],strs[j])){
                    ls.add(strs[j]);
                    log[j]=-1;
                }

            }
            list.add(ls);
        }
        return list;
        
    }
}
