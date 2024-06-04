class Solution {
    public int longestPalindrome(String s) {
        // TC : O(N+52) // SC : O(52)
        int n = s.length();
        if(n == 1) return 1;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        int ans = 0;
        boolean flag = false;
        for(char i : map.keySet()) {
            if(map.get(i)%2 == 0) {
                ans += map.get(i);
            }
            else if(map.get(i)%2 != 0) {
                ans += map.get(i)-1;
                flag = true;
            }
        }
        if(flag) ans++;
        return ans;
    }
}