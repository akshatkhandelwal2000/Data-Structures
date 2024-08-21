class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        // TC : O(N) // SC : O(N)
        int n = logs.length;
        int[] ans = new int[k];
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int id = logs[i][0];
            int time = logs[i][1];
            if(!map.containsKey(id)) {
                map.put(id, new HashSet<>());
                map.get(id).add(time);
            }
            else map.get(id).add(time);
        }
        for(int i : map.keySet()) {
            int in = map.get(i).size();
            ans[in-1]++;
        }
        return ans;
    }
}