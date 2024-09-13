class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        // TC : O(N*queries(Left,Right)) // SC : O(1)
        int n = arr.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            int x = queries[i][0];
            int y = queries[i][1];
            int xor = 0;
            for(int j = x; j <= y; j++) {
                xor ^= arr[j]; 
            }
            ans[i] = xor;
        }
        return ans;
    }
}