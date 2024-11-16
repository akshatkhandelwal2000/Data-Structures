class Solution {
    public int[] resultsArray(int[] nums, int k) {
        // TC : O(N*K) // SC : O(N-K+1)
        int n = nums.length;
        if(k == 1) {
            return nums;
        }
        int[] ans = new int[n-k+1];
        int i = 0;
        int j = 0;
        int max = -1;
        while(j < n) {
            max = Math.max(max, nums[j]);
            if(j > 0 && nums[j-1]+1 != nums[j]){
                ans[i] = -1;
            }
            if(j-i+1 == k) {
                ans[i] = ans[i] != -1 ? max : -1;
                max = 0;
                i++;
            }
            j++;
        }
        return ans;
    }
}