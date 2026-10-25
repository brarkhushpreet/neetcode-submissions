class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb= new StringBuilder();

        for(String str:strs){
            sb.append(str.length()+"#"+str);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> list= new ArrayList<>();

        for(int i=0;i<str.length();){
            StringBuilder sb = new StringBuilder();
            while(str.charAt(i)!='#'){
                 sb.append(str.charAt(i));
                 i++;
            }
            i++;
            int size=Integer.parseInt(sb.toString());
            list.add(str.substring(i,i+size));
            i=i+size;
        }
        return list;

    }
}
