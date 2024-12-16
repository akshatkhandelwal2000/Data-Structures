class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        // TC : O(NlogN) // SC : O(N)
        int n = nums.length;
        int[] ans = new int[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            if(a[0]==b[0]) {
                return a[1]-b[1];
            }
            else {
                return a[0]-b[0];
            }
        });
        for(int i = 0; i < n; i++) {
            pq.offer(new int[]{nums[i], i});
        }
        while(k-- > 0) {
            int x = pq.peek()[0];
            int y = pq.peek()[1];
            pq.poll();
            pq.offer(new int[]{x*multiplier, y});
        }
        while(!pq.isEmpty()) {
            ans[pq.peek()[1]] = pq.peek()[0];
            pq.poll();
        }
        return ans;
    }
}