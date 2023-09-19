class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // TC : O(NlogK) // SC : O(K)
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));
        for(int[] p : points) {
            pq.add(p);
            if(pq.size() > k) {
                pq.poll();
            }
        }
        int[][] ans = new int[k][2];
        while(!pq.isEmpty()) {
            k--;
            ans[k] = pq.poll();
        }
        return ans;
    }
}