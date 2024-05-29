class Solution {
    public int numSteps(String s) {
        // TC : O(N) // SC : O(1)
        int n = s.length();
        if(n == 1) return 0;
        int ans = 0;
        int j = s.length()-1;
        int carry = 0;
        while(j > 0) {
            int digit = Character.getNumericValue(s.charAt(j))+carry;
            if(digit % 2 == 0) {
                ans++;
            }
            else if(digit % 2 != 0) {
                ans += 2;
                carry = 1;
            }
            j--;
        }
        return ans+carry;
    }
}