class Solution {
    public int minOperations(int[] nums, int k) {
        // TC : O(NlogN) // SC : O(N)
        int n = nums.length;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i : nums) {
            pq.add((long)i);
        }
        int ans = 0;
        while(!pq.isEmpty() && pq.peek() < k) {
            if(pq.size() > 1 && pq.peek() < k) {
                long x = pq.poll();
                long y = pq.poll();
                long v = Math.min(x, y) * 2 + Math.max(x, y);
                pq.add(v);
                ans++;
            }
        }
        return ans;
    }
}