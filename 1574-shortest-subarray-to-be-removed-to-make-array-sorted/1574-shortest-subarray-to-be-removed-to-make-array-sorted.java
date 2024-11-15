class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        // TC : O(N) // SC : O(1)
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(j > 0 && arr[j-1] <= arr[j]) {
            j--;
        }
        if(j == 0) {
            return 0;
        }
        int ans = j;
        while(i < j && (i == 0 || arr[i-1] <= arr[i])) {
            while(j < n && arr[i] > arr[j]) {
                j++;
            }
            ans = Math.min(ans, j-i-1);
            i++;
        }
        return ans;
    }
}