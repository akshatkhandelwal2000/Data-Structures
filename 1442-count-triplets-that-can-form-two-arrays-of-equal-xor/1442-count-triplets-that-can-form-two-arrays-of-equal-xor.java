class Solution {
    public int countTriplets(int[] arr) {
        // TC : O(N * N) // SC : O(1)
        int n = arr.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int val = arr[i];
            for(int j = i+1; j < n; j++) {
                val ^= arr[j];
                if(val == 0) ans += (j-i);
            }
        }
        return ans;
    }
}