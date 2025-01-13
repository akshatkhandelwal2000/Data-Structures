class Solution {
    public int minimumLength(String s) {
        // TC : O(N) // SC : O(N)
        int n = s.length();
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for(char i : map.keySet()) {
            if(map.get(i)%2 != 0) {
                ans++;
            }
            if(map.get(i)%2 == 0) {
                ans += 2;
            }
        }
        return ans;  
    }
}