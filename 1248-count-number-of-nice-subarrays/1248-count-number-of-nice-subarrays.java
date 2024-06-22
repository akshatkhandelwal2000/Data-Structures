class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        // TC : O(N) // SC : O(1)
        int n = nums.length;
        int i = 0;
        int j = 0;
        int ans = 0;
        int odd = 0;
        int c = 0;
        while(j < n) {
            if(nums[j] % 2 != 0) {
                c = 0;
                odd++;
            }
            if(odd == k) {
                while(odd == k) {
                    c++;
                    if(nums[i] % 2 != 0) {
                        odd--;
                    }
                    i++;
                }
            }
            ans += c;
            j++;
        }
        return ans;
    }
}