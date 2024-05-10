class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        // TC : O(M * N * log K) // SC : O(k)
        int m = matrix.length;
        int n = matrix[0].length;
        int ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                pq.offer(matrix[i][j]);
                if(pq.size() > k) pq.poll();
            }
        }
        ans = pq.peek();
        return ans;
    }
}