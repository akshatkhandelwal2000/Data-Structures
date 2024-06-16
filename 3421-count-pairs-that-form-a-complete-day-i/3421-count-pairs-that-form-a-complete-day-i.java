class Solution {
    public int countCompleteDayPairs(int[] hours) {
        // TC : O(N*N) // SC : O(1)
        int n = hours.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if((hours[i]+hours[j]) % 24 == 0) {
                    ans++;
                }
            }
        }
        return ans;
    }
}