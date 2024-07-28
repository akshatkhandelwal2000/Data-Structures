class Solution {
    public int nonSpecialCount(int l, int r) {
        // TC : O(sqrt(r)*sqrt(r)) // SC : O(sqrt(r))
        int sq = (int)Math.sqrt(r);
        boolean[] isPrime = new boolean[sq+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2; i*i <= sq; i++) {
            if(isPrime[i]) {
                for(int j = i*i; j <= sq; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        int ans = r-l+1;
        for(int i = 2; i <= sq; i++) {
            if(isPrime[i]) {
                int square = i*i;
                if(square >= l && square <= r) {
                    ans--;
                }
            }
        }
        return ans;
    }
}