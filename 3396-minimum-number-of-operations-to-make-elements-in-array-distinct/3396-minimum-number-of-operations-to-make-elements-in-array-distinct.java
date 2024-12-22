class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int i = n-1;
        int j = 0;
        while(i >= 0) {
            set.add(nums[i]);
            j++;
            if(set.size() != j) {
                break;
            }
            i--;
        }
        return (int)Math.ceil((double)(i+1)/3);
    }
}