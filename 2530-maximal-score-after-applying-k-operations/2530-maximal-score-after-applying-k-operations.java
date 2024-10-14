class Solution {
    public long maxKelements(int[] nums, int k) {
        // TC : O(NlogN) // SC : O(N)
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums) {
            pq.offer(i);
        }
        long ans = 0;
        while(k-- > 0 && !pq.isEmpty()) {
            ans += pq.peek();
            double num = Math.ceil(pq.poll()/3.0);
            pq.offer((int)(num));
        }
        return ans;
    }
}