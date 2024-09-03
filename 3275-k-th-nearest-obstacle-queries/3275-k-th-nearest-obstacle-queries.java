class Solution {
    public int[] resultsArray(int[][] queries, int k) {
        int n = queries.length;
        int[] ans = new int[n];
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++) {
            pq.offer((long)(Math.abs(queries[i][0])+Math.abs(queries[i][1])));
            if(pq.size() < k) {
                ans[i] = -1;
                continue;
            }
            if(pq.size() > k) pq.poll();
            long v = pq.peek();
            ans[i] = (int)v;
        }
        return ans;
    }
}