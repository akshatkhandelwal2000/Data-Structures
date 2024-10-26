class Solution {
    public int minimizedStringLength(String s) {
        // TC : O(N) // SC : O(N)
        int n = s.length();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            set.add(s.charAt(i));
        }
        return set.size();
    }
}