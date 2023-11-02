class Solution {
    public boolean isHappy(int n) {
        if(n == 1) return true;
        if(n == 58) return false;
        int sum = 0;
        while(n > 0) {
            int digit = n%10;
            sum += digit*digit;
            n /= 10;
        }
        boolean ans = isHappy(sum);
        return ans; 
    }
}