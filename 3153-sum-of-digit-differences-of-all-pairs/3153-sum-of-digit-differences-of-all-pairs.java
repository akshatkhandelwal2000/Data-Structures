class Solution {
    public long sumDigitDifferences(int[] nums) {
        // TC : O(N * Len(num) * K) // SC : O(N)
        int n = nums.length;
        long v = nums[0];
        String s = Long.toString(v);
        long ans = 0;
        for(int i = 0; i < s.length(); i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for(int j = 0; j < n; j++) {
                map.put(nums[j]%10, map.getOrDefault(nums[j]%10, 0)+1);
                nums[j] = nums[j]/10;
            }
            int sum = n;
            for(int k : map.keySet()) {
                sum -= map.get(k);
                ans += (map.get(k)*sum);
            }
        }
        return ans;
    }
}