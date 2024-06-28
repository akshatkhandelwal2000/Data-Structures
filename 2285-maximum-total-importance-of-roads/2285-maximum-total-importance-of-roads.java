class Solution {
    public long maximumImportance(int n, int[][] roads) {
        // TC : O(NlogN) // SC : O(N);
        long[] arr = new long[n];
        for(int i = 0; i < roads.length; i++) {
            arr[roads[i][0]]++;
            arr[roads[i][1]]++;
        }
        Arrays.sort(arr);
        long ans = 0;
        int con = 1;
        for(long i : arr) {
            ans += i*con;
            con++;
        }
        return ans;
    }
}