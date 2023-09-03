class Solution {
    public int minimumOperations(String num) {
        // TC : O(N) // SC : O(1)
        // Only last two digits with these cases are divisible by 25.
        // 00 50 25 75
        int n = num.length();
        // seen zero
        boolean zero = false;
        // seen five
        boolean five = false;
        for(int i = n-1; i >= 0; i--) {
            int current = num.charAt(i) - '0';
            if((zero && (current == 0 || current == 5)) || (five && (current == 2 || current == 7))) {
                // subtract n - i as we have found our values on our way to n-1 to i and -1, -1 as in between n-1 to i we have got our values and we don't have to count them in minimum number of operations to make a number divisible by 25
                return n-i-1-1;
            }
            if(current == 0) zero = true;
            if(current == 5) five = true;
        }
        // if there is only one zero return n-1
        if(zero) return n-1;
        // return n as we have to remove all the digits to make it divisble by 25 as 25, 50, 75 or 00 was not found
        return n;   
    }
}