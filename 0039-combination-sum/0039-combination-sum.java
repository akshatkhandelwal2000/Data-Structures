class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // TC : O(2^N) // SC : O(N)
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        if(candidates.length == 0) return ans;
        rec(candidates, target, ans, a, 0, 0);
        return ans;
    }
    private void rec(int[] candidates, int target, List<List<Integer>> ans, List<Integer> a, int cursum, int index) {
        if(cursum > target) return; 
        if(cursum == target) {
            ans.add(new ArrayList<>(a));
            return;
        }
        for(int i = index; i < candidates.length; i++) {
            a.add(candidates[i]);
            rec(candidates, target, ans, a, cursum+candidates[i], i);
            a.remove(a.size()-1);
        }
    }
}