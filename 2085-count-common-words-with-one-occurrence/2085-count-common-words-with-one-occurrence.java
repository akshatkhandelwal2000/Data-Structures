class Solution {
    public int countWords(String[] words1, String[] words2) {
        // TC : O(M+N) // SC : O(M+N)
        Map<String, Integer> map = new HashMap<>();
        for(String s : words1) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        Map<String, Integer> map2 = new HashMap<>();
        for(String s : words2) {
            map2.put(s, map2.getOrDefault(s, 0)+1);
        }
        int ans = 0;
        for(String i : map.keySet()) {
            if(map.get(i) == 1 && map2.containsKey(i) && map2.get(i) == 1) {
                ans++;
            }
        }
        return ans;
    }
}