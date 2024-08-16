class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        // TC : O(N) // SC : O(1)
        int n = arrays.size();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int in = -1;
        int min2 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        int in2 = -1;
        for(int i = 0; i < n; i++) {
            if(arrays.get(i).get(arrays.get(i).size()-1) > max) {
                max = arrays.get(i).get(arrays.get(i).size()-1);
                in = i;
            }
            if(arrays.get(i).get(0) < min2) {
                min2 = arrays.get(i).get(0);
                in2 = i;
            }
        }
        for(int i = 0; i < n; i++) {
            if(i == in && i == in2) continue;
            if(arrays.get(i).get(0) < min) {
                min = arrays.get(i).get(0);
            }
            if(arrays.get(i).get(arrays.get(i).size()-1) > max2) {
                max2 = arrays.get(i).get(arrays.get(i).size()-1);
            }
        }
        int ans = Math.abs(max-min);
        int ans2 = Math.abs(max2-min2); 
        return Math.max(ans, ans2);
    }
}