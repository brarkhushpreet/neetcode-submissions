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
          while(i<str.length()){

             j=str.indexOf('#',i);
             i=Integer.parseInt(str.substring(i,j))+j+1;
             result.add(str.substring(j+1,i));
            
        }
        return result;

    }
}

