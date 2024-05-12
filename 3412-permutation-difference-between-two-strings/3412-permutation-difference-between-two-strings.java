class Solution {
    public int findPermutationDifference(String s, String t) {
        // TC : O(N) // SC : O(N)
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        for(int i = 0; i < n; i++) {
            map.put(s.charAt(i), i);
        }
        for(int i = 0; i < n; i++) {
            ans += Math.abs(map.get(s.charAt(i)) - map.get(t.charAt(i)));
        }
        return ans;
    }
}