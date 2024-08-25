class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        // TC : O(NlogN) // SC : O(N)
        int n = nums.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            if(a[0] == b[0]) {
                return a[1]-b[1];
            }
            else return a[0]-b[0];
        });
        for(int i = 0; i < n; i++) {
            pq.offer(new int[]{nums[i], i});
        }
        int[] ans = new int[n];
        while(k > 0) {
            int[] i = pq.poll();
            i[0] = i[0]*multiplier;
            pq.offer(i);
            k--;
        }
        while(!pq.isEmpty()) {
            ans[pq.peek()[1]] = pq.peek()[0];
            pq.poll();
        }
        return ans;
    }
}