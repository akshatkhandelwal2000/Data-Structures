class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // TC : O(N) // SC : O(k)
        int n = nums.length;
        int ans = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            sum += nums[i];
            sum%=k;
            if(sum==0) ans++;
            if(sum<0) sum+=k;
            if(map.containsKey(sum)) ans += map.get(sum);
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return ans;
    }
}