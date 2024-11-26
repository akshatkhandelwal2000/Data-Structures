class Solution {
    public int findChampion(int n, int[][] edges) {
        // TC : O(N) // SC : O(N)
        int m = edges.length;
        int[] a = new int[n];
        for(int i = 0; i < m; i++) {
            a[edges[i][1]]++;
        }
        int ans = 0;
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(a[i] == 0) {
                count++;
                ans = i;
            }
        }
        if(count > 1) {
            return -1;
        }
        return ans;
    }
}