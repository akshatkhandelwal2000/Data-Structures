class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // TC : O(M*N) // SC : O(1)
        int n = words.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            String word = words[i];
            int m = word.length();
            boolean flag = true;
            for(int j = 0; j < m; j++) {
                if(allowed.indexOf(word.charAt(j)) == -1) {
                    flag = false;
                }
            }
            if(flag) ans++;
        }
        return ans;
    }
}