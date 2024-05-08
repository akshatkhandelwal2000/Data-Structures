class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        // TC : O(N * N) // SC : O(N)
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                if(!list.contains(nums[j]) && nums[j] != -1) {
                    list.add(nums[j]);
                    nums[j] = -1;
                }
            }
            if(list.size() > 0) ans.add(list);
        }
        return ans;
    }
}