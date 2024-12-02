class Solution {
    public int getLargestOutlier(int[] nums) {
        // TC : O(N) // SC : O(N)
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(int i = 0; i < n; i++) {
            int currentOutlier = nums[i];
            map.put(currentOutlier, map.get(currentOutlier)-1);
            int a = sum-currentOutlier;
            if(a%2 == 0) {
                int b = a/2;
                if(map.getOrDefault(b, 0) > 0) {
                    ans = Math.max(ans, currentOutlier);
                }
            }
            map.put(currentOutlier, map.getOrDefault(currentOutlier, 0)+1);
        }
        return ans;
    }
}