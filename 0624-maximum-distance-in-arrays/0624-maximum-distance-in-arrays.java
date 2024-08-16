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
        return Math.abs(max-min);
    }
}