class Solution {
    public int maxProduct(int[] nums) {
        // TC : O(N) // SC : O(1)
        int n = nums.length;
        if(n == 1) return nums[0];
        int ans = 0;
        int pro = 1;
        for(int i = 0; i < n; i++) {
            pro *= nums[i];
            ans = Math.max(ans, pro);
            if(nums[i] == 0) pro = 1;
        }
        pro = 1;
        for(int i = n-1; i >= 0; i--) {
            pro *= nums[i];
            ans = Math.max(ans, pro);
            if(nums[i] == 0) pro = 1;
        }
        // TC : O(N * N) // SC : O(1)
        // for(int i = 0; i < n; i++) {
        //     int pro = 1;
        //     for(int j = i; j < n; j++) {
        //         pro *= nums[j] ;
        //         ans = Math.max(ans, pro);
        //     }
        // }
        return ans;
    }
}