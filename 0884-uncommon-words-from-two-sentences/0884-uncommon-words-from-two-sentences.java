class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        // TC : O(M+N) // SC : O(M+N)
        String[] m = s1.split(" ");
        String[] n = s2.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(String s : m) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        for(String s : n) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        int in = 0;
        for(String i : map.keySet()) {
            if(map.get(i) == 1) in++;
        }
        String[] ans = new String[in];
        in = 0;
        for(String i : map.keySet()) {
            if(map.get(i) == 1) ans[in++] = i;
        }
        return ans;
    }
}