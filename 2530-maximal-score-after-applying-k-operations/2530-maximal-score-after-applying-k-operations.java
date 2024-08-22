class Solution {
    public long maxKelements(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums) {
            pq.offer(i);
        }
        long ans = 0;
        while(k > 0 && !pq.isEmpty()) {
            int i = (int)Math.ceil(pq.peek()/3)+1;
            ans += pq.poll();
            pq.offer(i);
            k--;
        }
        return ans;
    }
}