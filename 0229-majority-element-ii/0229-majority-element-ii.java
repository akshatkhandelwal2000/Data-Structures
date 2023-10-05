class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(map.get(nums[i]) > n/3 && !ans.contains(nums[i])) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}