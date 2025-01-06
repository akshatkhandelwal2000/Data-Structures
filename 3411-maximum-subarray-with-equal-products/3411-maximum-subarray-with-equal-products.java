class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int a = nums[i];
            int b = nums[i];
            int c = nums[i];
            for(int j = i+1; j < n; j++) {
                a *= nums[j];
                b = gcd(b, nums[j]);
                c = lcm(c, nums[j]);
                if(a == b*c) {
                    ans = Math.max(ans, j-i+1);
                }
            }
        }
        return ans;
    }
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public int lcm(int a, int b) {
        return (a*b)/gcd(a,b);
    }
}