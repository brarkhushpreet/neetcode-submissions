class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
     int [] map= new int[26];

     for(int i=0;i<s.length();i++){
        char CharS=s.charAt(i);
        char CharT= t.charAt(i);
        map[CharS-'a']++;
        map[CharT-'a']--;
     }
     for(int val:map){
        if(val!=0){
            return false;
        }
     }
     return true;
    }
}
