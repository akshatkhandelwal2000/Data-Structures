class Solution {
    public int longestSquareStreak(int[] nums) {
        // TC : O(N) // SC : O(N)
        int n = nums.length;
        Set<Long> set = new HashSet<>();
        for(long i : nums) {
            set.add(i);
        }
        int ans = 0;
        for(int i = 2; i <= 1000; i++) {
            int count = 0;
            long a = i;
            while(set.contains(a)) {
                a = a*a;
                count++;
            }
            if(count >= 2) ans = Math.max(ans, count);
        }
        return ans == 0 ? -1 : ans;
    }
}