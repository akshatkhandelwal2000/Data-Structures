class Solution {
    public int distinctPrimeFactors(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            for(int j = 2; j <= nums[i]; j++) {
                while(nums[i] % j == 0) {
                    set.add(j);
                    nums[i] /= j;
                }
            }
        }
        return set.size();
    }
}