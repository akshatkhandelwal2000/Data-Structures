class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        // TC : O(N) // SC : O(1)
        int n = mountain.length;
        List<Integer> ans = new ArrayList<>();
        for(int i = 1; i < n-1; i++) {
            if(mountain[i] > mountain[i-1] && mountain[i] > mountain[i+1]) {
                ans.add(i);
            }
        }
        return ans;
    }
}