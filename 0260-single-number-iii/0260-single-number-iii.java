class Solution {
    public int[] singleNumber(int[] nums) {
        // TC : O(N) // SC : O(N)
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int[] ans = new int[2];
        int in = 0;
        for(int i : map.keySet()) {
            if(map.get(i) == 1) {
                ans[in++] = i;
            }
        }
        return ans;
    }
}