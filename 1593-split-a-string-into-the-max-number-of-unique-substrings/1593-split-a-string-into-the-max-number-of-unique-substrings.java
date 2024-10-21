class Solution {
    public int maxUniqueSplit(String s) {
        // TC : O(2^N) // SC : O(2^N)
        Set<String> set = new HashSet<>();
        int[] ans = new int[1];
        back(0, ans, set, s);
        return ans[0];
    }
    public void back(int idx, int[] ans, Set<String> set, String s) {
        if(idx >= s.length()) {
            ans[0] = Math.max(ans[0], set.size());
            return;
        }
        for(int i = idx; i < s.length(); i++) {
            String str = s.substring(idx, i+1);
            if(!set.contains(str)) {
                set.add(str);
                back(i+1, ans, set, s);
                set.remove(str);
            }
        }
    }
}