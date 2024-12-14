class Solution {
    public long findScore(int[] nums) {
        // TC : O(NlogN) // SC : O(N)
        int n = nums.length;
        long ans = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            if(a[0] == b[0]) {
                return a[1]-b[1];
            }
            else {
                return a[0]-b[0];
            }
        });
        Set<Integer> set = new HashSet<>(); 
        for(int i = 0; i < n; i++) {
            pq.offer(new int[]{nums[i], i});
        }
        while(!pq.isEmpty()) {
            int a = pq.peek()[0];
            int b = pq.peek()[1];
            pq.poll();
            if(set.contains(b)) {
                continue;
            }
            if(nums[b] != -1) {
                ans += nums[b];
                nums[b] = -1;
                set.add(b);
            }
            if(b-1 >= 0 && nums[b-1] != -1) {
                nums[b-1] = -1;
                set.add(b-1);
            }
            if(b+1 < n && nums[b+1] != -1) {
                nums[b+1] = -1;
                set.add(b+1);
            }
        }
        return ans;
    }
}