class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        // TC : O(M+N) // SC : O(1)
        int max = -1;
        for(int i = 0; i < left.length; i++) {
            max = Math.max(max, left[i]);
        }
        for(int i = 0; i < right.length; i++) {
            max = Math.max(max, n-right[i]);
        }
        return max;
    }
}