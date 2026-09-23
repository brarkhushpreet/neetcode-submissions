class Solution {
    public String foreignDictionary(String[] words) {
        HashMap<Character, Set<Character>> graph = new HashMap<>();
        HashMap<Character, Integer> indegree = new HashMap<>();

        for (int i = 0; i < words.length - 1; i++) {
            String w1 = words[i];
            String w2 = words[i + 1];
            int minLength = Math.min(w1.length(), w2.length());

            if (w1.length() > w2.length() && w1.substring(0, minLength).equals(w2.substring(0, minLength))) {
                return "";
            }

            for (int j = 0; j < minLength; j++) {
                char c1 = w1.charAt(j);
                char c2 = w2.charAt(j);

                // Initialize indegree for every character encountered
                indegree.putIfAbsent(c1, 0);
                indegree.putIfAbsent(c2, 0);

                if (c1 != c2) {
                    graph.computeIfAbsent(c1, k -> new HashSet<>());
                    if (!graph.get(c1).contains(c2)) {
                        graph.get(c1).add(c2);
                        indegree.put(c2, indegree.get(c2) + 1);
                    }
                    break;
                }
            }
        }

        
        for (String word : words) {
            for (char c : word.toCharArray()) {
                indegree.putIfAbsent(c, 0);
            }
        }

        Queue<Character> q = new LinkedList<>();
        for (char key : indegree.keySet()) {
            if (indegree.get(key) == 0) {
                q.add(key);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!q.isEmpty()) {
            char temp = q.remove();
            result.append(temp);
            for (char nei : graph.getOrDefault(temp, new HashSet<>())) {
                indegree.put(nei, indegree.get(nei) - 1);
                if (indegree.get(nei) == 0) {
                    q.add(nei);
                }
            }
        }

        return result.length() == indegree.size() ? result.toString() : "";
    }
}
