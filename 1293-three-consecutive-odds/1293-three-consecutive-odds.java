class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        // TC : O(N) // SC : O(1)
        int n = arr.length;
        int odd = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i]%2 != 0) {
                odd++;
            }
            else {
                odd = 0;
            }
            if(odd == 3) return true;
        }
        return false;
    }
}