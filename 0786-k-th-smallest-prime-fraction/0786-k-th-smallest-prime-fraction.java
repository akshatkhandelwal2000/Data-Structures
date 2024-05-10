class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        // TC : O(N * N * log K) // SC : O(K)
        int n = arr.length;
        int[] ans = new int[2];
        PriorityQueue<int[]> pq = new PriorityQueue<>((x,y) -> Double.compare((double)y[0] / y[1], (double)x[0] / x[1]));
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                pq.offer(new int[]{arr[i], arr[j]});
                if(pq.size() > k) pq.poll();
            }
        }
        ans[0] = pq.peek()[0];
        ans[1] = pq.peek()[1];
        return ans;
    }
}