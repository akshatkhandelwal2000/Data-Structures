class Solution {
    public int diagonalPrime(int[][] nums) {
        // TC : O(N) // SC : O(1)
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(isPrime(nums[i][n-i-1])) {
                ans = Math.max(ans, nums[i][n-i-1]);
            }
            if(isPrime(nums[i][i])) {
                ans = Math.max(ans, nums[i][i]);
            }
        }
        return ans;
    }
    public boolean isPrime(int v) {
        if(v == 1) return false;
        if(v == 2) return true;
        if(v % 2 == 0) return false;
        for(int i = 3; i*i <= v; i++) {
            if(v % i == 0) return false;
        }
        return true;
    }
}