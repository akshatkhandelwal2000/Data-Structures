class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        // TC : O(NlogN) // SC : O(N)
        int n = difficulty.length;
        int n2 = worker.length;
        int[][] job = new int[n][2];
        for(int i = 0; i < n; i++) {
            job[i][0] = difficulty[i];
            job[i][1] = profit[i];
        }
        Arrays.sort(job, (a,b) -> a[0]-b[0]);
        int i = 0;
        int k = 0;
        Arrays.sort(worker);
        int ans = 0;
        int max = 0;
        while(k < n2) {
            while(i < n && worker[k] >= job[i][0]) {
                max = Math.max(max, job[i][1]);
                i++;
            }
            ans += max;
            k++;
        }
        return ans;
    }
}