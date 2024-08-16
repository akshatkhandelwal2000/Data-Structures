class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        // TC : O(N) // SC : O(1)
        int n = arrays.size();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int in = -1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < arrays.get(i).size(); j++) {
                if(arrays.get(i).get(j) > max) {
                    max = arrays.get(i).get(j);
                    in = i;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            if(i == in) continue;
            for(int j = 0; j < arrays.get(i).size(); j++) {
                if(arrays.get(i).get(j) < min) {
                    min = arrays.get(i).get(j);
                }
            }
        }
        int min2 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        int in2 = -1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < arrays.get(i).size(); j++) {
                if(arrays.get(i).get(j) < min2) {
                    min2 = arrays.get(i).get(j);
                    in2 = i;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            if(i == in2) continue;
            for(int j = 0; j < arrays.get(i).size(); j++) {
                if(arrays.get(i).get(j) > max2) {
                    max2 = arrays.get(i).get(j);
                }
            }
        }
        int ans = Math.abs(max-min);
        int ans2 = Math.abs(max2-min2); 
        return Math.max(ans, ans2);
    }
}