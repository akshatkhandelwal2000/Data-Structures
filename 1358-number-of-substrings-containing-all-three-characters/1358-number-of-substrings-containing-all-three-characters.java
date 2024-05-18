class Solution {
    public int numberOfSubstrings(String s) {
        // TC : O(N) // SC : O(3)
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int ans = 0;
        while(j < n) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);
            while(map.size() == 3) {
                ans += n-j;
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)-1);
                if(map.get(s.charAt(i)) <= 0) {
                    map.remove(s.charAt(i));
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}