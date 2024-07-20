class Solution {
    public int minimumLength(String s) {
        // TC : O(N) // SC : O(N)
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        int ans = 0;
        for(int i : map.values()) {
            if(i%2 == 0) ans += 2;
            else ans++;
        }
        return ans;
    }
}