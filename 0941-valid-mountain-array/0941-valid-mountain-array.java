class Solution {
    public boolean validMountainArray(int[] arr) {
        // TC : O(N) // SC : O(1)
        int n = arr.length;
        if(n < 3) {
            return false;
        }
        int i = 1;
        while(i < n && arr[i-1] < arr[i]) {
            i++;
        }
        if(i >= n) {
            return false;
        }
        if(i == 1) {
            return false;
        }
        while(i < n && arr[i-1] > arr[i]) {
            i++;
        }
        if(i >= n) {
            return true;
        }
        return false;
    }
}