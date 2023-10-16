class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // TC : O(N*K) // SC : O(1)
        // int n = nums.length;
        // if(n == 0 || k == 0) {
        //     return new int[0];
        // }
        // int[] res = new int[n-k+1];
        // for(int i = 0; i < res.length; i++) {
        //     int max = nums[i];
        //     for(int j = i+1; j <= i+k-1; j++) {
        //         if(nums[j] > max) {
        //             max = nums[j];
        //         }
        //     }
        //     res[i] = max;
        // }
        // return res;
        // TC : O(N) // SC : O(K)
        int n = nums.length;
        if(n == 0) {
            return nums;
        }
        int[] res = new int[n-k+1];
        LinkedList<Integer> dq = new LinkedList<>();
        int r = 0;
        for(int i = 0; i < nums.length; i++) {
            while(!dq.isEmpty() && dq.peek() < i-k+1) {
                dq.poll();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.offer(i);
            if(i >= k-1) {
                res[r++] = nums[dq.peek()];
            }
        }
        return res;
    }
}