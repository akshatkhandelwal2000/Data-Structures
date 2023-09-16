class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        // TC : O(N) // SC : O(1)
        int len = nums.size();
        int i = 0, j = (len+1)/2;
        int ans = nums.size();
        while(i < len/2 && j < len) {
            if(nums.get(i) < nums.get(j)) {
                ans-=2;
            }
            i++;
            j++;
        }
        return ans;
    }
}