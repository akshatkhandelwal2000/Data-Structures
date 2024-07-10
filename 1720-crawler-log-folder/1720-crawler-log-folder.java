class Solution {
    public int minOperations(String[] logs) {
        // TC : O(N) // SC : O(1)
        int n = logs.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(logs[i].equals("./")) continue;
            if(logs[i].equals("../")) {
                ans--;
                ans = Math.max(0, ans);
            }
            else ans++;
        }
        return ans;
    }
}