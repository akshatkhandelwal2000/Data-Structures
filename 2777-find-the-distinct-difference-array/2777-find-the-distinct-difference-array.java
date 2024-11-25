class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        // TC : O(N) // SC : O(N)
        int n = nums.length;
        int[] ans = new int[n];
        int[] a = new int[n];
        int[] b = new int[n];
        Set<Integer> set = new HashSet<>();
        Set<Integer> sets = new HashSet<>();
        for(int i = 0; i < n; i++) {
            set.add(nums[i]);
            sets.add(nums[n-i-1]);
            a[i] = set.size();
            b[n-i-1] = sets.size();
        }
        for(int i = 0; i < n-1; i++) {
            ans[i] = a[i]-b[i+1];
        }
        ans[n-1] = set.size();
        return ans;
    }
}