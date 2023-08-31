class Solution {
    public int[] productExceptSelf(int[] nums) {
        // TC : O(N2) // SC : O(1);
        // int [] ans = new int[nums.length];
        // for(int i = 0; i < nums.length; i++) {
        //     int pro = 1;
        //     for(int j = 0; j < nums.length; j++) {
        //         if(i == j) continue;
        //         pro *= nums[j];
        //     }
        //     ans[i] = pro;
        // }
        // return ans;
        // TC : O(N) // SC : O(1) 
        // But Zero Divison Error
        // int [] ans = new int[nums.length];
        // int pro = 1;
        // for(int num : nums) {
        //     pro *= num;
        // }
        // for(int i = 0; i < nums.length; i++) {
        //     ans[i] = pro / nums[i];
        // }
        // return ans;
        // TC : O(N) // SC : O(1)
        int [] ans = new int[nums.length];
        Arrays.fill(ans, 1);
        int curr = 1;
        for(int i = 0; i < nums.length; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }
}