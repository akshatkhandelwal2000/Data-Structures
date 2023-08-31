class Solution {
    public List<List<Integer>> permute(int[] nums) {
        // TC : O(!N) * O(N) // SC : O(N)
        List<List<Integer>> ans = new ArrayList<>();
        recper(nums, ans, new ArrayList<>());
        return ans;
    }
    private void recper(int[] nums, List<List<Integer>> ans, List<Integer> temp) {
        if(temp.size() == nums.length) {
            //List<Integer> ds = new ArrayList<>();
            //for(int i = 0; i < nums.length; i++) {
                //ds.add(nums[i]);
            //}
            ans.add(new ArrayList<>(temp));
            return;
        }
        else {
         for(int i = 0; i < nums.length; i++) {
             if(temp.contains(nums[i])) continue; // skip if element already exists 
             temp.add(nums[i]);
             //swap(i, index, nums);
             recper(nums, ans, temp);
             //swap(i, index, nums);
             temp.remove(temp.size()-1);
        }
        }
    }
    // private void swap(int i, int j, int[] nums) {
    //     int temp = nums[i];
    //     nums[i] = nums[j];
    //     nums[j] = temp;
    // }
}