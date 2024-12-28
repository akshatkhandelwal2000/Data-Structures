class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        // TC : O(N^2) // SC : O(N)
        int n = nums.size();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            int a = nums.get(i).get(0);
            int b = nums.get(i).get(1);
            for(int j = a; j <= b; j++) {
                set.add(j);
            }
        }
        return set.size();
    }
}