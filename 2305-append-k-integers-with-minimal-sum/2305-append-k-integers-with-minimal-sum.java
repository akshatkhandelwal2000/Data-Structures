class Solution {
    public long minimalKSum(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        long score = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] <= k && !set.contains(nums[i])) {
                score += nums[i];
                k++;
            }
            set.add(nums[i]);
        }
        return (long)(k)*(k+1)/2-score;
    }
}