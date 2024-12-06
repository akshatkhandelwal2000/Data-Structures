class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        // TC : O(N) // SC : O(N)
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for(int i = 0; i < banned.length; i++) {
            set.add(banned[i]);
        }
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if(!set.contains(i)) {
                sum += i;
                if(sum <= maxSum) {
                    ans++;
                }
                else {
                    break;
                }
            } 
        }
        return ans;
    }
}