class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        // TC : O(2^N) // SC : O(N)
        List<List<Integer>> list = new ArrayList<>(); 
        List<Integer> path = new ArrayList<>();
        //Arrays.sort(nums);
        rec(list, path, 0, nums, k);
        return list.size();
    }
    public void rec(List<List<Integer>> list, List<Integer> path, int i, int[] nums, int k) {
        if(i == nums.length) {
            if(path.size() > 0) {
                list.add(new ArrayList<>(path));
            }
            return;
        }
        if(!path.contains(nums[i]-k) && !path.contains(nums[i]+k)) {
            path.add(nums[i]);
            rec(list, path, i+1, nums, k);
            path.remove(path.size()-1);
        }
        rec(list, path, i+1, nums, k);
    }
}