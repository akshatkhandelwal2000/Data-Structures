class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int n = nums.length;
        int m = queries.length;
        int[] ans = new int[m];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if(map.containsKey(nums[i])) {
                map.get(nums[i]).add(i);
            }
            else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            }
        }
        for(int i = 0; i < m; i++) {
            if(map.containsKey(x) && map.get(x).size() >= queries[i]) {
                List<Integer> list2 = map.get(x);
                ans[i] = list2.get(queries[i]-1);
            }
            else {
                ans[i] = -1;
            }
        }
        return ans;
    }
}