class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        // TC : O(N) // SC : O(N)
        int n = height.length;
        List<Integer> ans = new ArrayList<>();
        for(int i = 1; i < n; i++) {
            if(height[i-1] > threshold) {
                ans.add(i);
            }
        }
        return ans;
    }
}