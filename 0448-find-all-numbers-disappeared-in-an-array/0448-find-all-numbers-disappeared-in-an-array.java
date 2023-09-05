class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // TC : O(N) // SC : O(N)
        // Set<Integer> set = new HashSet<>();
        // for(int num : nums) {
        //     set.add(num);
        // }
        // List<Integer> list = new ArrayList<>();
        // for(int i = 1; i <= nums.length; i++) {
        //     if(!set.contains(i)) {
        //         list.add(i);
        //     }
        // }
        // return list;
        // TC : O(N) // SC : O(1)
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            int el = Math.abs(nums[i])-1;
            if(nums[el] > 0) {
                nums[el] = -nums[el];
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ans.add(i+1);
            }
        }
        return ans;
    }
}