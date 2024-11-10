class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        int ans = 0;
        int count = 1;
        int a = 0;
        for(int i = 1; i < n; i++) {
            if(nums.get(i) > nums.get(i-1)) {
                count++;
            }
            else {
                a = count;
                count = 1;
            }
            ans = Math.max(ans, Math.max(count/2, Math.min(a, count)));
        }
        return ans;
    }
}