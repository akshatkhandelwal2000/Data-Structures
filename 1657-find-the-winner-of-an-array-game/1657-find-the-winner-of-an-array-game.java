class Solution {
    public int getWinner(int[] arr, int k) {
        // TC : O(N) // SC : O(1)
        int max = 0;
        if(k >= arr.length) {
            for(int i = 0; i < arr.length; i++) {
                max = Math.max(max, arr[i]);
            }
            return max; 
        }
        int winCount = 1;
        int maxKnown = Math.max(arr[0], arr[1]);
        for(int i = 2; i < arr.length; i++) {
            if(winCount == k) {
                    break;
                }
            if(arr[i] > maxKnown) {
                maxKnown = arr[i];
                winCount = 1;
            }
            else {
                winCount++;
            }

        }
        return maxKnown;  
    }
}