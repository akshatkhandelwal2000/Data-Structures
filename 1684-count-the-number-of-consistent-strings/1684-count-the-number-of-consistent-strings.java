class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // TC : O(M+N*K) // SC : O(M)
        int n = words.length;
        Set<Character> set = new HashSet<>();
        for(char c : allowed.toCharArray()) {
            set.add(c);
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            String word = words[i];
            int k = word.length();
            boolean flag = true;
            for(int j = 0; j < k; j++) {
                if(!set.contains(word.charAt(j))) {
                    flag = false;
                }
            }
            if(flag) ans++;
        }
        return ans;
    }
}