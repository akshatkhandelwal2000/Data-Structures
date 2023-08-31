class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        // TC : O(N * N!) // SC : O(N) + O(N)
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        rec(nums, ans, new ArrayList<>(), new boolean[nums.length]);
        return ans;
    }
    public void rec(int[] nums, List<List<Integer>> ans, List<Integer> temp, boolean[] used) {
        if(temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        else {
            for(int i = 0; i < nums.length; i++) {
            if(used[i]) continue;
            if(i > 0 && nums[i] == nums[i-1] && used[i-1]) continue;
            used[i] = true;
            temp.add(nums[i]);
            rec(nums, ans, temp, used);
            temp.remove(temp.size()-1);
            used[i] = false;
            }
        }
    }
}