class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // TC : O(N+M) // SC : O(N)
        int n = arr1.length;
        int max = -1;
        for(int i = 0; i < n; i++) {
            max = Math.max(max, arr1[i]);
        }
        int[] arr = new int[max+1];
        for(int i = 0; i < n; i++) {
            arr[arr1[i]]++;
        }
        int index = 0;
        for(int i = 0; i < arr2.length; i++) {
            int val = arr2[i];
            while(arr[val] > 0) {
                arr1[index] = val;
                index++;
                arr[val]--;
            }
        }
        for(int i = 0; i <= max; i++) {
            while(arr[i] > 0) {
                arr1[index] = i;
                index++;
                arr[i]--;
            }
        }
        return arr1;
    }
}