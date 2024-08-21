class Solution {
    public int maxChunksToSorted(int[] arr) {
        // TC : O(N) // SC : O(1)
        int n = arr.length;
        int max = -1;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
            if(max == i) ans++;
        }
        return ans;
    }
}