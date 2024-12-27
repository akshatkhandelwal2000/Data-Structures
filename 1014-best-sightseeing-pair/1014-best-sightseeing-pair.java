class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        // TC : O(N) // SC : O(N)
        int n = values.length;
        int ans = 0;
        int[] arr = new int[n];
        arr[0] = values[0];
        for(int i = 1; i < n; i++) {
            int a = values[i]-i;
            ans = Math.max(ans, arr[i-1]+a);
            int b = values[i]+i;
            arr[i] = Math.max(arr[i-1], b);
        }
        return ans;
    }
}