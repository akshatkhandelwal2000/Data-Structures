class Solution {
    public char findTheDifference(String s, String t) {
        int n = t.length();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)+1);
        }
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)-1);
        }
        for(char c : map.keySet()) {
            if(map.get(c) == 1) {
                return c;
            }
        }
        return 's';
    }
}