class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        // TC : O(N^2) // SC : O(N)
        int n = nums.length;
        int[] ans = new int[n];
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            set.add(nums[i]);
            Set<Integer> sets = new HashSet<>();
            for(int j = i+1; j < n; j++) {
                sets.add(nums[j]);
            }
            ans[i] = set.size()-sets.size();
        }
        return ans;
    }
}