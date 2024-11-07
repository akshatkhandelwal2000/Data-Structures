class Solution {
    public int countQuadruplets(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                for(int k = j+1; k < n; k++) {
                    int a = k+1;
                    if(a < n) {
                        for(int b = a; b < n; b++) {
                            if(nums[i] + nums[j] + nums[k] == nums[b]) {
                                ans++;
                            }
                        }
                    }
                }
            } 
        }
        return ans;
    }
}