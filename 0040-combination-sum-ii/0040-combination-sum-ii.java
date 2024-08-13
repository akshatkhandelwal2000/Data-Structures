class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        if(candidates.length <= 0) {
            return result;
        }
        combinationSum2Helper(candidates, target, new ArrayList<>(), 0);
        return result;
    }
    public void combinationSum2Helper(int [] candidates, int target, List<Integer> res, int index) {
        if(target == 0) {
            result.add(new ArrayList<>(res));
        }
        for(int i = index; i < candidates.length; i++) {
            if(i != index && candidates[i] == candidates[i - 1] ) {
                continue;
            }
            if(candidates[i] <= target) {
                res.add(candidates[i]);
                combinationSum2Helper(candidates, target - candidates[i], res, i + 1);
                res.remove(res.size() - 1);
            }
        }
    }
}