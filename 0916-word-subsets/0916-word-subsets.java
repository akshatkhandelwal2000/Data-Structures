class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        // TC : O(M+N) // SC : O(N)
        int n = words1.length;
        int m = words2.length;
        List<String> ans = new ArrayList<>();
        Map<Character, Integer> wordsmap = new HashMap<>(); 
        for(int i = 0; i < m; i++) {
            String a = words2[i];
            Map<Character, Integer> map = new HashMap<>();
            for(int j = 0; j < a.length(); j++) {
                map.put(a.charAt(j), map.getOrDefault(a.charAt(j), 0)+1);
                if(!wordsmap.containsKey(a.charAt(j)) || wordsmap.get(a.charAt(j)) < map.get(a.charAt(j))) {
                    wordsmap.put(a.charAt(j), map.get(a.charAt(j)));
                }
            }
        }
        for(int i = 0; i < n; i++) {
            boolean flag = true;
            String a = words1[i];
            Map<Character, Integer> words1map = new HashMap<>();
            for(int e = 0; e < a.length(); e++) {
                words1map.put(a.charAt(e), words1map.getOrDefault(a.charAt(e), 0)+1);
            }
            for(char c : wordsmap.keySet()) {
                if(!words1map.containsKey(c) || words1map.get(c) < wordsmap.get(c)) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                ans.add(words1[i]);
            }
        }
        return ans;
    }
}