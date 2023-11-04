class Solution {
    public int removeDuplicates(int[] nums) {
        // TC : O(N) // SC : O(1)
        if(nums.length <= 2) return nums.length;
        int index = 2;
        for(int i = 2; i < nums.length; i++) {
            if(nums[i] != nums[index-2]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}