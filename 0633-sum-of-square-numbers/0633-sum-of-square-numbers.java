class Solution {
    public boolean judgeSquareSum(int c) {
        // TC : O(Math.Sqrt(c)) // SC : O(1)
        long i = 0;
        long j = (int)Math.sqrt(c);
        while(i <= j) {
            if((i*i)+(j*j) == c) return true;
            else if((i*i)+(j*j) < c) i++;
            else if((i*i)+(j*j) > c) j--;
        }
        return false;
    }
}