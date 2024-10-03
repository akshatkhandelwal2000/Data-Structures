class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        int score = n;
        int count = 0;
        for(int i = 0; i < n; i++) {
            count = (count + nums[i]) % p;
        }
        int target = count % p;
        if(target == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int max = 0;
        for(int i = 0; i < n; i++) {
            max = (max + nums[i]) % p;
            int min = (max-target+p) % p;
            if(map.containsKey(min)) {
                score = Math.min(score, i-map.get(min));
            }
            map.put(max, i);
        }
        return score == n ? -1 : score;
    }
}