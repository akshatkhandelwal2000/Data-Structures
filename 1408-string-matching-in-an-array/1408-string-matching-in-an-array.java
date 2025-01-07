class Solution {
    public List<String> stringMatching(String[] words) {
        // TC : O(N^2) // SC : O(N)
        int n = words.length;
        Set<String> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(words[i].contains(words[j])) {
                    set.add(words[j]);
                }
                if(words[j].contains(words[i])) {
                    set.add(words[i]);
                }
            }
        }
        List<String> ans = new ArrayList<>(set);
        return ans;
    }
}