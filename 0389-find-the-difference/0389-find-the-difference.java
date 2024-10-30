class Solution {
    public char findTheDifference(String s, String t) {
        // TC : O(N + 26) // SC : O(26)
        int n = t.length();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)+1);
            if(i < n-1) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)-1);
            }
        }
        for(char c : map.keySet()) {
            if(map.get(c) == 1) {
                return c;
            }
        }
        return 's';
    }
}