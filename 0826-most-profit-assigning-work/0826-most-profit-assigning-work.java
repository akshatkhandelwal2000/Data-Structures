class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        // TC : O(NlogN) + O(NlogN) // SC : O(N) + O(N)
        int n = difficulty.length;
        int n2 = worker.length;
        int[][] job = new int[n][2];
        for(int i = 0; i < n; i++) {
            job[i][0] = difficulty[i];
            job[i][1] = profit[i];
        }
        Arrays.sort(job, (a,b) -> a[0]-b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int i = 0;
        int k = 0;
        Arrays.sort(worker);
        int ans = 0;
        while(k < n2) {
            while(i < n && worker[k] >= job[i][0]) {
                pq.offer(job[i][1]);
                i++;
            }
            if(!pq.isEmpty()) {
                ans += pq.peek();
            }
            k++;
        }
        return ans;
    }
}