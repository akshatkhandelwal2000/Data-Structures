class Solution {
    public long maxKelements(int[] nums, int k) {
        // TC : O(NlogN) // SC : O(N)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums) {
            pq.offer(i);
        }
        long ans = 0;
        while(k > 0) {
            double i = Math.ceil((double)pq.peek()/3);
            ans += pq.poll();
            pq.offer((int)i);
            k--;
        }
        return ans;
    }
}