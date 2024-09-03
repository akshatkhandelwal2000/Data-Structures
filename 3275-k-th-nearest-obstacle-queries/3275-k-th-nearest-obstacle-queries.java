class Solution {
    public int[] resultsArray(int[][] queries, int k) {
        int n = queries.length;
        int[] ans = new int[n];
        List<Long> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add((long)(Math.abs(queries[i][0])+Math.abs(queries[i][1])));
            if(list.size() < k) {
                ans[i] = -1;
                continue;
            }
            Collections.sort(list);
            long v = list.get(k-1);
            ans[i] = (int)v;
        }
        return ans;
    }
}