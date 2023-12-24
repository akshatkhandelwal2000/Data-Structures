class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i+=2) {
            int element = nums[i];
            int adjacentElement = nums[i+1];
            nums[i] = adjacentElement;
            nums[i+1] = element;
        }
        return nums;
    }
}