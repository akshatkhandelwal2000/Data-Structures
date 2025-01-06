class Solution {
    public int[] minOperations(String boxes) {
        // TC : O(N^2) // SC : O(1)
        int n = boxes.length();
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            int a = 0;
            for(int j = 0; j < n; j++) {
                if(i == j) {
                    continue;
                }
                if(boxes.charAt(j) == '1') {
                    a += Math.abs(i-j);
                }
            }
            ans[i] = a;
        }
        return ans;
    }
}