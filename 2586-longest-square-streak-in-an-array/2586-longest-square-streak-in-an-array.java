class Solution {
    public int longestSquareStreak(int[] nums) {
        int n = nums.length;
        Set<Long> set = new HashSet<>();
        for(long i : nums) {
            set.add(i);
        }
        int ans = 0;
        for(int num : nums) {
            int count = 0;
            long a = num;
            while(set.contains(a)) {
                a = a*a;
                count++;
            }
            if(count >= 2) ans = Math.max(ans, count);
        }
        return ans == 0 ? -1 : ans;
    }
}