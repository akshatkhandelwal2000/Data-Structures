class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long ans = 0;
        int i = 0;
        int j = 0;
        Map<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        while(j < n) {
            sum += nums[j];
            map.put(nums[j], map.getOrDefault(nums[j], 0)+1);
            if(j-i+1 == k) {
                while(i < j && map.size() < j-i+1 || map.size() > k) {
                    map.put(nums[i], map.getOrDefault(nums[i], 0)-1);
                    if(map.get(nums[i]) == 0) {
                        map.remove(nums[i]);
                    }
                    sum -= nums[i];
                    i++;
                }
            }
            if(j-i+1 == k && map.size() == k) {
                ans = Math.max(ans, sum);
                map.put(nums[i], map.getOrDefault(nums[i], 0)-1);
                if(map.get(nums[i]) == 0) {
                    map.remove(nums[i]);
                }
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return ans;
    }
}