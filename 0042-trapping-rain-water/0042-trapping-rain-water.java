class Solution {
    public int trap(int[] height) {
        // TC : O(N) // SC : O(1)
        int left = 0, right = height.length-1;
        int maxLeft = 0, maxRight = 0;
        int maxWater = 0;
        while(left <= right) {
            if(height[left] <= height[right]) {
                if(height[left] >= maxLeft) maxLeft = height[left];
                else maxWater += maxLeft - height[left];
                left++;  
            }
            else {
                if(height[right] >= maxRight) maxRight = height[right];
                else maxWater += maxRight - height[right];
                right--;
            }
        }
        return maxWater;
        // TC : O(N) + O(N) + O(N) // SC : O(N) + O(N)
        // int[] prefix = new int[height.length];
        // int[] suffix = new int[height.length];
        // int ans = 0;
        // int preMax = 0, sufMax = 0;
        // for(int i = 0; i < height.length; i++) {
        //     preMax = Math.max(preMax, height[i]);
        //     prefix[i] = preMax;
        // }
        // for(int i = height.length-1; i >= 0; i--) {
        //     sufMax = Math.max(sufMax, height[i]);
        //     suffix[i] = sufMax; 
        // }
        // for(int i = 0; i < height.length; i++) {
        //     ans += Math.min(prefix[i], suffix[i])-height[i];
        // }
        // return ans;
    }
}