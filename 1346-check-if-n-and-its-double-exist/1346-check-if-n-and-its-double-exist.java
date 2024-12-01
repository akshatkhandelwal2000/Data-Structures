class Solution {
    public boolean checkIfExist(int[] arr) {
        // TC : O(N^2) // SC : O(1)
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j) {
                    continue;
                }
                if(arr[i] == 2*arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}