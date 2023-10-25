class Solution {
    public int kthGrammar(int n, int k) {
        // TC -> O(N)
        // SC -> O(1)
        boolean areValueSame = true;
        n = (int)Math.pow(2, n-1);
        while(n != 1) {
            n = n/2;
            if(k > n) {
                k -= n;
                areValueSame = !areValueSame;
            }
        }
        return areValueSame ? 0 : 1;

    }
}