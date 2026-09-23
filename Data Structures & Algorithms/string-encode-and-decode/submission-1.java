class Solution {

    public String encode(List<String> strs) {
        String result="";
        for(int i=0;i<strs.size();i++){
            result+=Integer.toString(strs.get(i).length())+"#"+strs.get(i);
        }
        return result;

    }

    public List<String> decode(String str) {
           List<String> words = new ArrayList<>();
          
           int i=0;
           int skip=0;

           while(i<str.length()){
              int j=i;
              String temp="";
              while(str.charAt(j)!='#'){
               temp+=str.charAt(j);
               j++;
              }
              words.add(str.substring(j+1,j+1+Integer.parseInt(temp)));
              i=j+1+Integer.parseInt(temp);
           }


           return words;
    }
}
