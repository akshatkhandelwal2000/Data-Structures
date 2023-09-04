class Solution {
    public int countSymmetricIntegers(int low, int high) {
        // TC : O(N * K) // SC : O(1)
        int count = 0;
        for(int i = low; i <= high; i++) {
            if(issymmetric(i)) count++;
        }
        return count; 
    }
    private boolean issymmetric(int n) {
        String s = String.valueOf(n);
        int len = s.length();
        if(len % 2 != 0) return false;
        int mid = len/2;
        int s1 = 0, s2 = 0;
        for(int i = 0; i < mid; i++) {
            s1 += s.charAt(i) - '0';
            s2 += s.charAt(len-i-1) - '0';
        }
        return s1 == s2;
    } 
}