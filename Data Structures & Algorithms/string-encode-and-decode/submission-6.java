class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            // 3-digit header (supports up to 999 chars)
            sb.append(String.format("%03d", str.length())).append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int len = Integer.parseInt(s.substring(i, i + 3)); // read 3-digit length
            i += 3;
            res.add(s.substring(i, i + len));
            i += len;
        }
        return res;
    }
}
