class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        // TC : O(N log N) // SC : O(1)
        int n = happiness.length;
        Arrays.sort(happiness);
        long ans = 0;
        int v = 0;
        for(int i = n-1; i >= 0; i--) {
            if(k > 0 && happiness[i]-v >= 0) {
                ans += happiness[i]-v;
            }
            else {
                break;
            }
            v++;
            k--;
        }
        return ans;
    }
}