class Solution {
    public long maximumImportance(int n, int[][] roads) {
        // TC : O(NlogN) // SC : O(N);
        int[] arr = new int[n];
        for(int i = 0; i < roads.length; i++) {
            arr[roads[i][0]]++;
            arr[roads[i][1]]++;
        }
        Arrays.sort(arr);
        long ans = 0;
        int imp = 1;
        for(int i : arr) {
            ans += i*imp;
            imp++;
        }
        return ans;
    }
}