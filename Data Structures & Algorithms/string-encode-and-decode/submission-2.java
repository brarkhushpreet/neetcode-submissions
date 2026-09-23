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
           while(i<str.length()){
              int j=str.indexOf('#',i);
              i=Integer.parseInt(str.substring(i,j))+j+1;
              words.add(str.substring(j+1,i));
            
           }


           return words;
    }
}
