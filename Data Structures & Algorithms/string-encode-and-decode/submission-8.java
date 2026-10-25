class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<strs.size();i++){
            int size=strs.get(i).length();
            if(size<10){
            sb.append("1"+size+strs.get(i));
                       } else if(size < 100) {
                sb.append("2" + size + strs.get(i));
            } else {
                sb.append("3" + size + strs.get(i));
            }
          }
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> list= new ArrayList<>();

        for(int i=0;i<str.length();){
            char curr= str.charAt(i);
            int size=curr-'0';
            if(size==1){
                int len=str.charAt(i+1)-'0';
                list.add(str.substring(i+2,i+2+len));
                i=i+2+len;
            }else if(size==2){
                int len=Integer.parseInt(str.substring(i+1,i+3));
                list.add(str.substring(i+3,i+3+len));
                i=i+3+len;
                 
            }else if(size==3){
                int len=Integer.parseInt(str.substring(i+1,i+4));
                list.add(str.substring(i+4,i+4+len));
                i=i+4+len; 
            } else{
                list.add("");
                i++;
            }
        }
        return list;

    }
}
