class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        // TC : O(N) // SC : O(N)
        int n = nums.size();
        long ans = 0;
        int i = 0;
        int j = 0;
        Map<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        while(j < n) {
            sum += nums.get(j);
            map.put(nums.get(j), map.getOrDefault(nums.get(j), 0)+1);
            if(j-i+1 == k) {
                if(i < j && map.size() < m) {
                    map.put(nums.get(i), map.getOrDefault(nums.get(i), 0)-1);
                    if(map.get(nums.get(i)) == 0) {
                        map.remove(nums.get(i));
                    }
                    sum -= nums.get(i);
                    i++;
                }
            }
            if(j-i+1 == k && map.size() >= m) {
                ans = Math.max(ans, sum);
                map.put(nums.get(i), map.getOrDefault(nums.get(i), 0)-1);
                if(map.get(nums.get(i)) == 0) {
                    map.remove(nums.get(i));
                }
                sum -= nums.get(i);
                i++;
            }
            j++;
        }
        return ans;
    }
}