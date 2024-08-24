class Solution {
    public int minOperations(int[] nums, int k) {
        // TC : O(NlogN) // SC : O(N)
        int n = nums.length;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(long i : nums) {
            pq.offer(i);
        }
        int ans = 0;
        while(pq.size() > 1 && pq.peek() < k) {
            long i = pq.poll();
            long j = pq.poll();
            pq.offer((Math.min(i, j)*2)+Math.max(i, j));
            ans++;
        }
        return ans;
    }
}