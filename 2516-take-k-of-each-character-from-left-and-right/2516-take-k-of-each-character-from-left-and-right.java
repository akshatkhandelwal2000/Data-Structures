class Solution {
    public int takeCharacters(String s, int k) {
        // TC : O(N) // SC : O(1)
        int n = s.length();
        int[] map = new int[3];
        for(int i = 0; i < n; i++) {
            map[s.charAt(i)-'a']++;
        }
        for(int i = 0; i < 3; i++) {
            if(map[i] < k) {
                return -1;
            }
        }
        int ans = 0;
        int i = 0;
        int j = 0;
        int[] count = new int[3];
        while(j < n) {
            count[s.charAt(j)-'a']++;
            while(i <= j && map[0] - count[0] < k || map[1] - count[1] < k || map[2] - count[2] < k) {
                count[s.charAt(i)-'a']--;
                i++;
            }
            ans = Math.max(ans, j-i+1);
            j++;
        }
        return n-ans;
    }
}