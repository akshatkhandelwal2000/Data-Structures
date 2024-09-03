class Solution {
    public int[] resultsArray(int[][] queries, int k) {
        // TC : O(NlogK) // SC : O(N)
        int n = queries.length;
        int[] ans = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++) {
            pq.offer((Math.abs(queries[i][0])+Math.abs(queries[i][1])));
            if(pq.size() < k) {
                ans[i] = -1;
                continue;
            }
            if(pq.size() > k) pq.poll();
            ans[i] = pq.peek();
        }
        return ans;
    }
}