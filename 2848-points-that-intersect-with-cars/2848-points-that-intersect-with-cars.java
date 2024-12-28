class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        // TC : O(N^2) // SC : O(N)
        int n = nums.size();
        Set<Integer> set = new HashSet<>();
        int min = 101;
        int max = 0;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int a = nums.get(i).get(0);
            int b = nums.get(i).get(1);
            for(int j = a; j <= b; j++) {
                set.add(j);
                min = Math.min(min, j);
                max = Math.max(max, j);
            }
        }
        for(int i = min; i <= max; i++) {
            if(set.contains(i)) {
                ans++;
            }
        }
        return ans;
    }
}