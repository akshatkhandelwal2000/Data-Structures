class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int n = nums.length;
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i = 0; i < n; i++) {
            if(set.contains(nums[i])) {
                set2.add(nums[i]);
            }
            else {
                set.add(nums[i]);
            }
        }
        for(int i : set2) {
            ans ^= i;
        }
        return ans;
    }
}