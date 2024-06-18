class Solution {
    public long countCompleteDayPairs(int[] hours) {
        // TC : O(N) // SC : O(N)
        int n = hours.length;
        Map<Integer, Integer> map = new HashMap<>();
        long ans = 0;
        for(int i = 0; i < n; i++) {
            ans += map.getOrDefault(((24-hours[i]%24)%24), 0);
            map.put(hours[i]%24, map.getOrDefault(hours[i]%24, 0)+1);
        }
        return ans;
    }
}