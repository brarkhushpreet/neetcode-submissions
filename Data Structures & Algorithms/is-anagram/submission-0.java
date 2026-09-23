class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
     Map<Character,Integer> map= new HashMap<>();

     for(int i=0;i<s.length();i++){
        char CharS=s.charAt(i);
        char CharT= t.charAt(i);
        map.put(CharS,map.getOrDefault(CharS,0)+1);
        map.put(CharT,map.getOrDefault(CharT,0)-1);
     }
     for(int val:map.values()){
        if(val!=0){
            return false;
        }
     }
     return true;
    }
}
