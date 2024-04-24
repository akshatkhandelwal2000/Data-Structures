class Solution {
    public int tribonacci(int n) {
        // TC : O(3^N) // SC : O(3^N)
        // if(n == 0) return 0;
        // if(n == 1) return 1;
        // if(n == 2) return 1;
        // int ans = tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
        // return ans;
        // TC : O(N) // SC : O(N)
        if(n <= 2) {
            if(n == 0) return 0;
            else return 1;
        } 
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[n];
        // TC : O(N) // SC : O(1)
        // int a = 0, b = 1, c = 1;
        // for(int i = 0; i < n-2; i++) {
        //     int temp = a + b + c;
        //     a = b;
        //     b = c;
        //     c = temp;
        // }
        // return c;
    }
}