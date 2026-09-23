class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb= new StringBuilder();

        for(String str:strs){
            sb.append(str.length()+"#"+str);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> result= new ArrayList<>();

          int i=0;
          int j=0;
           int size=0;
          while(i<str.length()){
           
            
              if(str.charAt(i)=='#'){
                 size=Integer.parseInt(str.substring(j,i));
                 j=i+1+size;
                 result.add(str.substring(i+1,j));
                 i=j;
                 
              }
              i++;

            
        }
        return result;

    }
}

