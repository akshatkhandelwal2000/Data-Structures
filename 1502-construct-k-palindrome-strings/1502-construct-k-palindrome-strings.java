class Solution {
    public boolean canConstruct(String s, int k) {
        int n = s.length();
        if(n < k) return false;
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for(char i : map.keySet()) {
            if(map.get(i)%2 != 0) count++;
        }
        return count > k ? false : true;
    }
}