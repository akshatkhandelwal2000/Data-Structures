class Solution {
    public int thirdMax(int[] nums) {
        // TC : O(N) // SC : O(N)
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : set) {
            pq.offer(i);
            if(pq.size() > 3) {
                pq.poll();
            }
        }
        if(pq.size() < 3) {
            if(pq.size() == 2) {
                pq.poll();
            }
            return pq.peek();
        }
        return pq.peek();
    }
}