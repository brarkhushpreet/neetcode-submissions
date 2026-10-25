class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb= new StringBuilder();

        for(String str:strs){
            sb.append(str.length()+",");
        }
        sb.append("#");
        for(String str:strs){
            sb.append(str);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
    List<Integer> sizes = new ArrayList<>();
    List<String> list = new ArrayList<>();

    int i = 0;

    while (str.charAt(i) != '#') {
        StringBuilder sb = new StringBuilder();

        while (str.charAt(i) != ',') {
            sb.append(str.charAt(i));
            i++;
        }

        sizes.add(Integer.parseInt(sb.toString()));
        i++;
    }

    i++; 

    for (int size : sizes) {
        list.add(str.substring(i, i + size));
        i += size;
    }

    return list;
}
}