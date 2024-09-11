class Solution {
    public int minBitFlips(int start, int goal) {
        // TC : O(1) // SC : O(1)
        return Integer.bitCount(start ^ goal);
    }
}