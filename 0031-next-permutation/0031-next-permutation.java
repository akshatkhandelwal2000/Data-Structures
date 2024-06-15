class Solution {
    public void nextPermutation(int[] nums) {
        // TC : O(N + N + NlogN) // SC : O(1)
        int n = nums.length;
        for(int i = n-1; i >= 0; i--) {
            if(i == 0) {
                Arrays.sort(nums);
                return;
            }
            else if(nums[i-1] < nums[i]) {
                for(int j = n-1; j >= i; j--) {
                    if(nums[j] > nums[i-1]) {
                        int temp = nums[i-1];
                        nums[i-1] = nums[j];
                        nums[j] = temp;
                        Arrays.sort(nums, i, n);
                        return;
                    }
                }
            }
        }
    }
}