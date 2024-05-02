class Solution {
    public int findMaxK(int[] nums) {
        // TC : O(N + N) // SC : O(N) 
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            if(nums[i] < 0) {
                set.add(nums[i]);
            }
        }
        int ans = -1;
        int v = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] > v && set.contains(-nums[i])) {
                v = nums[i];
                ans = nums[i];
            }
        }
        return ans;
    }
}