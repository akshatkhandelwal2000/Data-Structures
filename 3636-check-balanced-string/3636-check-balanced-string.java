class Solution {
    public boolean isBalanced(String num) {
        // TC : O(N) // SC : O(1)
        int n = num.length();
        int a = 0;
        int b = 0;
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                a += num.charAt(i)-'0';
            }
            else {
                b += num.charAt(i)-'0';
            }
        }
        return a == b;
    }
}